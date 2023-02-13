package com.source.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.source")
public class EggConfiguration {

	public EggConfiguration() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("Registering ViewResolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
	{
		System.out.println("Registering LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();

				return bean;
		
	}
	
	
	
	
	
	
}
