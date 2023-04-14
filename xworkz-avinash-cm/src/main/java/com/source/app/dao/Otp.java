package com.source.app.dao;

import java.time.LocalDateTime;

public class Otp {

	 private int code;
	    private LocalDateTime createdDateTime;
	    private LocalDateTime expirationDateTime;

	    public Otp(int code, LocalDateTime createdDateTime, LocalDateTime expirationDateTime) {
	        this.code = code;
	        this.createdDateTime = createdDateTime;
	        this.expirationDateTime = expirationDateTime;
	    }

	    public int getCode() {
	        return code;
	    }

	    public LocalDateTime getCreatedDateTime() {
	        return createdDateTime;
	    }

	    public LocalDateTime getExpirationDateTime() {
	        return expirationDateTime;
	    }

	    public boolean isExpired() {
	        return LocalDateTime.now().isAfter(expirationDateTime);
	    }
	}
	

