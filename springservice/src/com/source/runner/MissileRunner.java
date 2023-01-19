package com.source.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.source.configuration.SpringConfigration;
import com.source.dto.FirstAidDTO;
import com.source.dto.MissileDTO;
import com.source.service.FirstService;
import com.source.service.MissileSerivice;

public class MissileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MissileDTO dto = new MissileDTO("AGNI-5","emergency Kit",34);
	
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigration.class);
		
		MissileSerivice service = context.getBean(MissileSerivice.class);
	   
		boolean saved = service.validatingTheMissile(new MissileDTO());
		service.validatingTheMissile(dto);
		System.out.println("saved:"+saved);
		
	}

}
