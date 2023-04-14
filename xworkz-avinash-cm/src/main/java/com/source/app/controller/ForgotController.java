package com.source.app.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

import javax.mail.internet.AddressException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.source.app.dao.Otp;
import com.source.app.dto.AiWorld;
import com.source.app.entity.AiEntity;
import com.source.app.repository.AiRepo;
import com.source.app.service.AiService;
import com.source.app.service.EmailService;
import com.source.app.service.EmailServices;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ForgotController {
	
	@Autowired
	private EmailServices service;
	
	@Autowired
	AiService aiService;
	
	@Autowired
	AiRepo aiRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	Random random = new Random(1000);
	
	@GetMapping("forgot")
	public String openEmailForm()
	{
		

		
		return "forgot_email_form";
	}
	

	@PostMapping("forgot")
	public String sendOTP(@RequestParam("email") String email,HttpSession session) throws AddressException
	{
		log.info("Email:"+email);
       //generating OTP of 4 digits
		
		
		int otp = (int) (Math.random() * 900000) + 100000;
		log.info("OTP"+otp);
		
		String subject = "OTP from SCM";
		String message = " OTP = "+otp;
		String to = email;
		
		boolean flag =this.service.sendEmail(subject, message, to);
		
		if(flag)
		{
			  // Set the creation time of the OTP to the current time
	        LocalDateTime createdDateTime = LocalDateTime.now();

	        // Set the expiration time of the OTP to 5 minutes from the creation time
	        LocalDateTime expirationDateTime = createdDateTime.plusMinutes(1);

	        // Create a new Otp object with the code and creation time
	        Otp otpObject = new Otp(otp, createdDateTime, expirationDateTime);

	        
	        session.setAttribute("otpObject", otpObject);
		    session.setAttribute("myOtp", otp);
			session.setAttribute("email", email);
			return "verify_otp";
			
		}
		else
		{
		session.setAttribute("message", "Check your email ID !!");
		return "forgot_email_form";
		}
	}
	
	
	@PostMapping("verify-otp")
	public String verifyOtp(@RequestParam("otp") int otp, HttpSession session) {
	    int myOtp = (int) session.getAttribute("myOtp");
	    String email = (String) session.getAttribute("email");
	  
	    Otp otpObject = (Otp) session.getAttribute("otpObject");
	
	   
	    
	    if ( myOtp == otp && otpObject != null) {
	    	 try {
	    		 
	    		// LocalDateTime otpCreationTime = (LocalDateTime) session.getAttribute("otpCreationTime");
	    		 LocalDateTime otpCreationTime = otpObject.getCreatedDateTime();
	    		    LocalDateTime currentDateTime = LocalDateTime.now();
 
	    		    
	    		    System.out.println("OTP creation time: " + otpCreationTime);
	                System.out.println("Current time: " + currentDateTime);
	    		
	                long expirationTime = otpCreationTime.plusMinutes(1).toEpochSecond(ZoneOffset.UTC) * 1000;
	                System.out.println("Expiration time: " + new Timestamp(expirationTime));

	                
	                
	    		    if (currentDateTime.isBefore(otpCreationTime.plusMinutes(1))) {	    
	        // password change form;
	    	AiWorld ref =this.aiService.findByEmailId(email);
	    	if(ref==null)
	    	{
	    		//sending error message
	    		log.info("User is not exist:"+ref);
	    		session.setAttribute("messaging", "User is not exist");
	    		return "forgot_email_form";
	    		
	    	}
	    	
	    	else
	    	{
	    		//send change password form
	    		 return "newpassword";
	    	}
	    	
	    		    }
	    		    else
	    		    {
	    		   	    session.setAttribute("message", "OTP verification Timing out please click on verify button again");
	    		    	return "verify_otp";
	    		    
	    		    }
	    }   catch (Exception e) {
            //handle any potential exceptions that might occur
            session.setAttribute("message", "An error occurred while processing your request. Please try again later.");
            return "forgot_email_form";
	    }
	    	 }else {
	        session.setAttribute("message", "You have entered wrong OTP check the mail ID");
	        return "verify_otp";
	    }
		
	}

	
	
	//change password
	@PostMapping("change-password")
	public String changePassword(@RequestParam String userId,@RequestParam("newpassword") String password,@RequestParam("confirmpassword")String confirmPassword)
 {
		
	
		this.aiService.changePassword(userId, password, confirmPassword);
		
		return "Login";
}
	

 }
	
	
	
	


