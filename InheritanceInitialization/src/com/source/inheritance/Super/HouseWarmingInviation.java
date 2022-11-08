package com.source.inheritance.Super;

import com.source.inheritance.Invitation;

public class HouseWarmingInviation extends Invitation {

	public HouseWarmingInviation(String name, String type, String color) {
		super(name, type, color);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public void letMeSee()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.color);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
