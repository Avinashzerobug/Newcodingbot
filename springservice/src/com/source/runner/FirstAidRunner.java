package com.source.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.source.configuration.SpringConfigration;
import com.source.dto.FirstAidDTO;
import com.source.repositary.FirstAidRepo;
import com.source.repositary.FirstAidRepoImpl;
import com.source.service.FirstAidServiceImpl;
import com.source.service.FirstService;

public class FirstAidRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstAidDTO dto = new FirstAidDTO("Detol","emergency Kit",34,true);
	
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigration.class);
		
		FirstService service = context.getBean(FirstService.class);
	   
		boolean saved = service.validatingTheData(new FirstAidDTO());
		service.validatingTheData(dto);
		System.out.println("saved:"+saved);
		
	
		
	}

}
