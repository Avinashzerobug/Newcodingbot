package com.source.inheritance.Super;

import com.source.inheritance.PreWeddingShoot;

public class MiniatureShoot extends PreWeddingShoot {

	public MiniatureShoot(String cameraName, String type, int price) {
		super(cameraName, type, price);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void letsSee()
	
	{
	  System.out.println(this.cameraName);
		System.out.println(this.price);
		System.out.println(this.type);
		
		
	}

	
	
	
	
	
	
	
	
}
