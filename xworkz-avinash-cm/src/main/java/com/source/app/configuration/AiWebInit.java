package com.source.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.source.app.dto.AiWorld;

public class AiWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AiConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) { // thus overriding theServlet container's default handling of static resources.
		// TODO Auto-generated method stub
		configurer.enable();
	}
	
	  @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }
	 
	    @Bean
	    public CommonsMultipartResolver multipartResolver() {
	        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
	        resolver.setDefaultEncoding("utf-8");
	        resolver.setMaxUploadSize(10240000);
	        return resolver;
	    }
	    
	   
	    
	    
	    
	}





	

