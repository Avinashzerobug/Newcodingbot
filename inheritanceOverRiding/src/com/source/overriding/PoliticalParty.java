package com.source.overriding;

public class PoliticalParty {

	
	public String  type;
	public int     noOfPoliticalParty;
	
	public PoliticalParty(String type, int noOfPoliticalParty) 
	{
		super();
		this.type = type;
		this.noOfPoliticalParty = noOfPoliticalParty;
	}
	
	
	public void display()
	{
		System.out.println(this.type);
		System.out.println(this.noOfPoliticalParty);
		
	}
	
	
	
	
	
	
}
