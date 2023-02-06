package com.source.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.source.controller")
public class BeachConfiguration {

	public BeachConfiguration() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the BEACH Configuration using the server");
		System.out.println(this.getClass().getSimpleName());
	}

	
	
}
