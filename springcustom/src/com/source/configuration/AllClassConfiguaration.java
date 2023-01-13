package com.source.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.source.component")
public class AllClassConfiguaration {

	public AllClassConfiguaration() {
		super();
		System.out.println("Checking the configuration of the All class Configuration");
	}

	

}
