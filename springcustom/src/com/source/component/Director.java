package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Director {

	@Autowired
	Experience experience;
	@Autowired
	CameraMan cameraMan;
	
	
	
	public void director()
	{
		if(cameraMan!=null)
		{
		System.out.println(experience.hashCode()+"Getting the values of Experience hash code");
		System.out.println(cameraMan.hashCode()+"Getting the values of CameraMan hash code");
		}
		else
		{
			System.out.println("I think its pointing to the null without reason");
		}
	}
	
}
