package com.system.association;

public class Country {

	public String name;
	public City[] cities;
	public President president;
	
	
	public Country(String name)
	{
		this.name = name;
		
	}
	
	public void setCities(City[] cities)
	{
		this.cities = cities;
	}
	
	public void setPresident(President president)
	{
		this.president = president;
	}
	
	public void letMeSee()
	{
		if (cities!=null)
		{
		
			for (int i = 0; i < cities.length; i++)
			{
				City city = cities[i];	
				
				
				if(city!=null)
				{
					System.out.println("*****Name of the president,Capital or not and Area in Square KM******");
					System.out.println("---------------------------------");
					city.see();
				}
			}
		}
			else
			{
				System.out.println("Welcome to the Null world");
			}
		
		if(president!=null)
		{
			
			System.out.println("****Country name and President name*******");
			System.out.println("------------------------------------------");
			this.president.show();
			
		}
		else
		{
			System.out.println("Welcome to the world");
		}
		
	
		System.out.println(this.name);
		
	
		
		}
		
		
		
		
		
		
		
		
	}
	
	
	





