package com.source.inheritance.Super;

import com.source.inheritance.Marriage;

public class LoveMarriage  extends Marriage{

	public LoveMarriage(String name, String location, int noOfInvitationCard) {
		super(name, location, noOfInvitationCard);
		// TODO Auto-generated constructor stub
	}


	
	
	public void love()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.noOfInvitationCard);
		
		
		
	}
	
}
