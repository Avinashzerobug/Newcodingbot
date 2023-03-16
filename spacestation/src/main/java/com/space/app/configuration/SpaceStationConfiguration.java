package com.space.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.space.app")
public class SpaceStationConfiguration {

	
	public SpaceStationConfiguration() { 
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the space station configuration class");
	}

	MultipartResolver multipartResolver()
	{
		System.out.println("registering the multupart resolver");
		return new StandardServletMultipartResolver();
	}
	
	
	
	
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Running success view resolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean() // to connect sql to spring
	{
		System.out.println("Creating the entity manager facotry");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
