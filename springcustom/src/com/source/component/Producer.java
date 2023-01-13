package com.source.component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	Company company;
	@Autowired
	Assitant assistant;
	
	
	
	public void checking() {
		
		System.out.println(company.hashCode()+"Initializing the company hash code");
		System.out.println(assistant.hashCode()+"Initiaizing the assistant hash code");
	}
	
	
	
	
	
	
}
