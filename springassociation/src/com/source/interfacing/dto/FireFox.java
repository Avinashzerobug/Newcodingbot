package com.source.interfacing.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.source.interfacing.Browser;
import com.source.interfacing.Provider;

@Component
public class FireFox implements Browser {

	@Autowired
	@Qualifier("airtel")
	private Provider provide;
	
	
	
	@Override
	public void browse() {
          System.out.println("Creating the Fire Fox thing");
          provide.connect();
	}

}
