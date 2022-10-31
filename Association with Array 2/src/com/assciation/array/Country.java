package com.assciation.array;

public class Country {

	public String name;
	public String capital;
	public long   population;
	public String presidentName;
	
	public Country()
	{
		
	}
	
	
	
	public void count(long population,String name,String capital,String presidentName)
	{
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.presidentName = presidentName;
		
	}

	public void see()
	{
		System.out.println("Country name and its capital area");
		System.out.println("************************************************************");
	
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.population);
		System.out.println(this.presidentName);
		System.out.println(System.lineSeparator());
	}
	
	
	
}
