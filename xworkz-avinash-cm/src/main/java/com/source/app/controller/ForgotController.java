package com.source.app.controller;

import java.util.Random;

import javax.mail.internet.AddressException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.source.app.service.EmailService;
import com.source.app.service.EmailServices;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ForgotController {
	
	@Autowired
	private EmailServices service;

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
		
		
	int otp =	random.nextInt(999999);
		log.info("OTP"+otp);
		
		String subject = "OTP from SCM";
		String message = " OTP = "+otp;
		String to = email;
		
		boolean flag =this.service.sendEmail(subject, message, to);
		
		if(flag)
		{
			
		//	session.setAttribute("myOtp", otp);
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
	public String verifyOtp(@RequestParam("otp") int otp,HttpSession session)
	{
		int myOtp = (int)session.getAttribute("myOtp");
		session.getAttribute("email");
		if(myOtp==otp)
		{
			//password change form
			return "password_change_form";
		}
		else
		{
			session.setAttribute("message", "You have entered wrong OTP check the mail ID");
			return "verify_otp";
		}
		
	}
	
	
	
	
	
	
	
	
}
