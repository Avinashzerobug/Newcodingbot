package com.source.inheritance.Super;

import com.source.inheritance.Catering;

public class WeddingCatering extends Catering {

	public WeddingCatering(String name, String type, int noOfServers) {
		super(name, type, noOfServers);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public void show()
	{
		
		System.out.println(this.name);
		System.out.println(this.noOfServers);
		System.out.println(this.type);
		
		
		
		
	}
	
	
	
	
	
	

}
