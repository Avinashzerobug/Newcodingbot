package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Camera {
	@Autowired
	Battery battery;
	@Autowired
	Lens lens;
	
	
	public void camera()
	{
		System.out.println(battery.hashCode()+"Getting the values of the Battery hash code");
		System.out.println(lens.hashCode()+"Getting the values of the lens hash code");
	}
	
}
