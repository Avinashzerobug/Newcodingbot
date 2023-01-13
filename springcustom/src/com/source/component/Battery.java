package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Battery {
	@Autowired
	Capacity capacity;
	
	
	public void battery()
	{
		System.out.println(capacity.hashCode()+"Getting the values of the Capacity hash code");
	}
	
	
}
