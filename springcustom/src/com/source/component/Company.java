package com.source.component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	Location location;

	public void company() {
		
		System.out.println(location.hashCode()+"initialzing the hash code of the location");
	}
	
	
	
	
}
