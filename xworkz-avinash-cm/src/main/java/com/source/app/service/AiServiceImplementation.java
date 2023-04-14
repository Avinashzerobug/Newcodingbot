package com.source.app.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Encoder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.sql.DataSource;

import com.source.app.dto.AiWorld;
import com.source.app.entity.AiEntity;
import com.source.app.repository.AiRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AiServiceImplementation implements AiService,RowMapper<AiWorld> {

	@Autowired
	private AiRepo aiRepo;
	
	@Autowired
    PasswordEncoder passwordEncoder;
	
	
	
	private Set<ConstraintViolation<AiWorld>> validate(AiWorld userDto) {
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validationFactory.getValidator();
		Set<ConstraintViolation<AiWorld>> vailation = validator.validate(userDto);
		return vailation;
	
	}
	
	
	
	@Override
	public Set<ConstraintViolation<AiWorld>> validateAndSave(AiWorld aiWorld) {
		// TODO Auto-generated method stub
		Long emailCount = this.aiRepo.findByEmail(aiWorld.getEmail());
		Long userCount = this.aiRepo.findByUser(aiWorld.getUserId());
		Long mobileCount = this.aiRepo.findByMobile(aiWorld.getNum());
		log.error("emailCount-" + emailCount);
		log.error("userCount-" + userCount);
		log.error("mobileCount-" + mobileCount);
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator validator2 = validator.getValidator();
		if(emailCount == 0 && userCount == 0 && mobileCount == 0) {
			if(aiWorld.getPassword().equals(aiWorld.getConfirmPassword())) {
		
		Set<ConstraintViolation<AiWorld>> violation = validator2.validate(aiWorld);
		if(violation!=null && !violation.isEmpty())
		{
			
			log.error("something error in dto:"+aiWorld);
			violation.forEach(cv->{
				log.error(cv.getMessage());
				
			});
			
			return violation;
		}
		
		else
		{
			log.info("No Violations procceding to save");
			log.error("emailCount--" + emailCount);
			log.error("userCount--" + userCount);
			log.error("mobileCount--" + mobileCount);
			AiEntity entity = new AiEntity();
			entity.setUserId(aiWorld.getUserId());
			entity.setSignUpId(aiWorld.getSignUpId());
			entity.setPassword(passwordEncoder.encode(aiWorld.getPassword()));
			entity.setNum(aiWorld.getNum());
			entity.setEmail(aiWorld.getEmail());
			entity.setConfirmPassword(passwordEncoder.encode(aiWorld.getConfirmPassword()));
			entity.setCreatedBy(aiWorld.getUserId());
			entity.setCreatedDate(LocalDateTime.now());
			
			boolean saved = this.aiRepo.saved(entity);
			log.info("AI DTO saved in service:"+saved);
		}
		}
		else
		{
			log.error("password must be match each other");
		}
		}
	else
	{
		log.error("User already exist");
	}
		
			return Collections.emptySet();			
			
			
	}	
		
	

	@Override
	public List<AiWorld> findAll() {
		List<AiEntity> entity = this.aiRepo.findAll();
		List<AiWorld> lists = new ArrayList<AiWorld>();
		for (AiEntity entities : entity) {
			AiWorld dto = new AiWorld();
			BeanUtils.copyProperties(entity, dto);
			lists.add(dto);

		}
		return lists;
	}

	@Override
	public Long findByEmail(String email) {
		Long emailcount = this.aiRepo.findByEmail(email);
		log.error("Find  by Email");
		return emailcount;
	}

	@Override
	public Long findByMobile(Long num) {
		Long mobilecount = this.aiRepo.findByMobile(num);
		return mobilecount;
	}

	@Override
	public Long findByUser(String userId) {
		Long userCount = this.aiRepo.findByUser(userId);
		return userCount;
	} 

	/*
	@Override
	public boolean sendMail(String email) {
		String portNumber = "587";// 485,587,25
		String hostName = "smtp.office365.com";
		String fromEmail = "avinashmullur4246@gmail.com";
		String password = "Avinash@4246";
		String to = email;

		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.sttartls.enable", true);
		prop.put("mail.debug", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.transport.protocal", "smtp");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}

		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration  Completed");
			message.setText("Thanks for registration");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("mail sent sucessfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return false;
	}*/



	@Override
	public AiWorld mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public AiWorld findByUserId(String userId,String password) {
		// TODO Auto-generated method stub
		log.info("Running userandpassword in service");
		AiWorld dto = new AiWorld();
			AiEntity entities = this.aiRepo.findByUserId(userId);
			
			
			BeanUtils.copyProperties(entities, dto); 		    
		    log.info(entities.getUserId());
		    log.info(entities.getPassword());
		    log.info("password converting " + passwordEncoder.matches(password, entities.getPassword()));
		    
		 //   if(entities.getLoginCount()>=3) {
		    	
		    	 // log.info("Valid data");
			     // return dto;
		    	
		//    }	
				if(passwordEncoder.matches(password, entities.getPassword())&& entities.getUserId().equals(userId))
				{
	                  return dto;
				}
				else
				{
				   this.aiRepo.findByLogIn(userId, entities.getLoginCount()+1);
				   
					log.info("Count to login "+ entities.getLoginCount() +1);
				  
					return null;
				}
		   
	}		
		      
			
			
			//System.out.println("Size in dtos " + listOfDTO.size());
			
		
	
	
	
/*	@Override
	public List<AiWorld> findByUserIdies(String userId, Integer loginCount, String password) {
		// TODO Auto-generated method stub
		List<AiEntity> entities = this.aiRepo.findByUserIdies(userId);
		List<AiWorld> listOfDTO = new ArrayList<AiWorld>();
		AiWorld dto = new AiWorld();
		AiEntity entity = new AiEntity();
		if(dto.getLoginCount()>=3)
		{
			if(passwordEncoder.matches(password, entity.getPassword()))
			{
		for(AiEntity entity1 : entities)
		{
			
			BeanUtils.copyProperties(entity1, dto);
			System.out.println("DTO from copyProperties"+dto);
			listOfDTO.add(dto);
			log.info(dto.getPassword());
			log.info(dto.getUserId());
			
		}
			}
			else
			{
				loginCount++;
				log.info("Invalid userId or password");
			}
		}
		return AiService.super.findByUserIdies(userId, loginCount, password);
	}*/
	
	
	
  @Override
public AiWorld findByEmailId(String email) {
	// TODO Auto-generated method stub
	  log.info("running the find by email id:");
	  AiWorld dto = new AiWorld();
	AiEntity entity =  this.aiRepo.findByEmailId(email);
	if(email.equals(entity.getEmail()))
	{
		return dto;
	}
	else
	{
		log.info("email id both are not matching");
	}
	  
	return AiService.super.findByEmailId(email);
}

  
    @Override
	public AiWorld changePassword(String userId, String password, String confirmPassword) {
		
	
		
		
		if (password.equals(confirmPassword)) {

			boolean passwordUpdated = this.aiRepo.changeByPassword(userId, password, confirmPassword);
			
	 
			//entity.setPassword(passwordEncoder.encode(aiWorld.getPassword()));	
			//entity.setConfirmPassword(passwordEncoder.encode(aiWorld.getConfirmPassword()));
	     	
				
		log.info("passwordUpdated--" + passwordUpdated);
         
		
		}
		else
		{
			log.info("Something issue in your code");
		}
		 
				
		return AiService.super.changePassword(userId, password, confirmPassword);
		
	}
  

}