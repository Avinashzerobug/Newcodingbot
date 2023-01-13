package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CameraMan {

	@Autowired
	Camera camera;
	
	
	public void cameraMan()
	{
		System.out.println(camera.hashCode()+"Getting the value of camera hash code");
	}
	
}
