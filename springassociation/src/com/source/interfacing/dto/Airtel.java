package com.source.interfacing.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.source.interfacing.Browser;
import com.source.interfacing.Provider;

@Component
public class Airtel implements Provider {

	@Autowired
	@Qualifier("chrome")
	private Browser browse;
	
	@Override
	public void connect() {
		
		System.out.println("Checking the Airtel cls method is workingo or not");
		browse.browse();
		
		
	}

}
