package com.source.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.source")
public class BakeryConfiguration {

	public BakeryConfiguration() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Running the Bakery Configuration class");
	}

	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("View Resolver in Configuration class");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}
	
	
}
