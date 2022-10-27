package com.association.boot.associating;

public class Company {

	
	public String name;
	public char   type;
	
	
	
	public Company()
	{
		
	}
	
	public Company(String name,char type)
	{
		this.name = name;
		this.type = type;
		
	}
	
	public void pill()
	{
		
		System.out.println("Associating the Company class to Piller");
	}
	
	public void showOff()
	{
		
		System.out.println(this.name);
		System.out.println(this.type);
		
	}
	
	
	
	
}
