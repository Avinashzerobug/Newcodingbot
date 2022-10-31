package com.assciation.array;

public class City {

	
	public String name;
	public long   population;
	public boolean polluted;
	public String  oldName;
	
	
	
	
	public void city(String oldName,String name,long population,boolean polluted)
	{
		this.name = name;
		this.population = population;
		this.polluted = polluted;
		this.oldName = oldName;
			
	}
	
	public void show() 
	
	{
		System.out.println("City name and its Old name");
		System.out.println("************************************************************");
	
		System.out.println(this.name);
		System.out.println(this.population);
		System.out.println(this.polluted);
		System.out.println(this.oldName);
	
		System.out.println(System.lineSeparator());
	}
	
	
	
	
	
	
	
	
}
