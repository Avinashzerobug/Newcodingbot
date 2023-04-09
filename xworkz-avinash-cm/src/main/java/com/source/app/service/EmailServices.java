package com.source.app.service;

import javax.mail.internet.AddressException;

public interface EmailServices {

	
	 boolean sendEmail(String subject,String message,String to) throws AddressException;
}
