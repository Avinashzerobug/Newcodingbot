package com.system.association;

public class City {

	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;
	
	
	public City(Name name,boolean capital,double areaInSquareKilometers)
	
	{
		this.capital = capital;
		this.areaInSquareKilometers = areaInSquareKilometers;
		this.name = name;
	}
	
	
	
	public void see()
	{
		System.out.println(this.capital);
		System.out.println(this.areaInSquareKilometers);
		if(name!=null)
		{
		
			this.name.display();
			System.out.println(System.lineSeparator());
			
		}
		
		else
		{
			System.out.println("Welcome to the  world");
		}
	}
	
	
	
	
	
	
}
