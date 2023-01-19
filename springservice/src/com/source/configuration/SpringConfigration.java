package com.source.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.source.repositary","com.source.service"})
public class SpringConfigration {

	    @Bean 
	  public Validator validator ()
	  {
		  System.out.println("Initializing the validator in the configuration class");
		  ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		  Validator validator = factory.getValidator();
		  return validator;
		  
	  }
	
	
}
