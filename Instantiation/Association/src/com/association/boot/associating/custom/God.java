package com.association.boot.associating.custom;

public class God {

	public String name;
	public String gender;
	public String mainPower;
    public Weapon astra = new Weapon();	
	
	public God()
	{
		
	}
	
	public void god(String name,String gender,String mainPower)
	{
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
		
		if(astra!=null)
		{
		
			astra.weapon("Trishul","TO Destroy the World",4563565765L);
			}
		else
		{
			System.out.println("Welcome to the Null World");
		}
		
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.gender);
		System.out.println(this.mainPower);
		System.out.println("************************************");
		 System.out.println("Weapons Details");
		 System.out.println(System.lineSeparator());
	    astra.see();
		
	}
	
	
	
	
	
}
