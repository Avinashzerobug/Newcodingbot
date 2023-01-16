package com.source.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.source.configuration.BrowseConfiguration;
import com.source.interfacing.dto.Airtel;
import com.source.interfacing.dto.FireFox;

public class BrowseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(BrowseConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
	
		System.out.println(context.getBeanDefinitionCount());
		
		FireFox fire = context.getBean(FireFox.class);
		fire.browse();
		
		Airtel airtel = context.getBean(Airtel.class);
		airtel.connect();
	}

}
