package com.source.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.source.controller")
public class AvinashConfiguration {

	public AvinashConfiguration() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the configuratio class"+this.getClass().getSimpleName());
	}

	
	
}
