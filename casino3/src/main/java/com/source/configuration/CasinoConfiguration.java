

package com.source.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.source.controller")
public class CasinoConfiguration {

	public CasinoConfiguration() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the Casino Configuration using the server");
		System.out.println(this.getClass().getSimpleName());
	}

	
	
	
}