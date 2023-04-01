package com.source.app.configuration;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.source.app")
@Slf4j
public class AiConfiguration {
	
	
   
	public AiConfiguration() {
		super();
	
		// TODO Auto-generated constructor stub
		 log.info("Creating the Artificial intelliegence Configuration class"+this.getClass().getSimpleName());
	}
	

	@Bean
	public MultipartResolver multipartResolver()
	{
	   log.info("Registering the multipart resolver in configuration class");
	   return new StandardServletMultipartResolver();
	}
	
    @Bean
	 public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean()
	 {
		 log.info("Creating the entity manager facotry in configuration class");
		 return new LocalContainerEntityManagerFactoryBean();
	 }
	
    @Bean
	public ViewResolver viewResolver()
	{
		System.out.println("Running success view resolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
    public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/ai_db");
		datasource.setPassword("Avinash42464225");
		datasource.setUsername("root");
		return datasource;
	}
	
}
