package com.source.app.service;

import java.util.Properties;
import java.util.Set;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;

import org.springframework.stereotype.Service;

import com.source.app.dto.AiWorld;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmailService implements EmailServices {

	@Override
	public boolean sendEmail(String subject, String message, String to) throws AddressException {
	    InternetAddress from = new InternetAddress("avinashmullur.xworkz4246@hotmail.com");
   
	    
	  
	    
	    
	   

	    Properties properties = System.getProperties();
	    log.info("Properties" + properties);

	    properties.put("mail.smtp.host", "smtp.office365.com");
	    properties.put("mail.smtp.port", 587);
	    properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
	    properties.put("mail.smtp.ssl.ciphersuites", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
	    properties.put("mail.smtp.starttls.enable", "true");
	  //  properties.put("mail.smtp.ssl.enable", "true");
	    properties.put("mail.smtp.auth", "true");
	  //  properties.put("mail.smtp.ssl.trust", "*");

	    Properties properties1 = System.getProperties();
	    log.info("Properties" + properties1);
	    

	    Session session = Session.getInstance(properties, new Authenticator() {
	        @Override
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication("avinashmullur.xworkz4246@hotmail.com", "Nexi@42464225");
	        }
	    });

	    session.setDebug(true);

	    MimeMessage m = new MimeMessage(session);

	    try {
	        m.setFrom(from);
	        m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	        m.setSubject(subject);
	        m.setText(message);
	     //   m.setContent(message,"text/html");  //this is for which format you want to receive the otp code it may bord using the html in forgot controller class

	        Transport.send(m);

	        log.info("Sent Successfully.......................");
	        return true;
	    } catch (MessagingException e) {
	        e.printStackTrace();
	        return false;
	    }
	}	
	
	
	
	
	
	
	
	
}
