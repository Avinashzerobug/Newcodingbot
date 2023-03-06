package com.source.vinay.configuration;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpaceStationWebInit extends AbstractAnnotationConfigDispatcherServletInitializer //AbstractAnnotationConfigDispatcherServletInitializer default it has associate with dispatcherservlet
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() { //its work based on listner
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {  //its associate with application context(inteface)..its for to initializr spring
		// TODO Auto-generated method stub
		return new Class[] {SpaceStationConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {  //its use for map all the request
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) { // thus overriding theServlet container's default handling of static resources.
		// TODO Auto-generated method stub
		configurer.enable();
	}

}
