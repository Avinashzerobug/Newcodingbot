package com.source.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.source.configuration.SpringConfigration;
import com.source.dto.MissileDTO;
import com.source.dto.ResortDTO;
import com.source.service.MissileSerivice;
import com.source.service.ResortSerivce;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ResortDTO dto = new ResortDTO("TATA Taj","Mumbai",34);
	
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigration.class);
		
		ResortSerivce service = context.getBean(ResortSerivce.class);
	   
		boolean saved = service.validatingTheResort(new ResortDTO());
		service.validatingTheResort(dto);
		System.out.println(saved);

		
		
		
		
	}

}
