package com.source.component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {

	@Autowired
	Area area;

	public void location() {
		
		System.out.println(area.hashCode()+"initalizing the area hash code");
	}
	
	
	
	
	
	
}
