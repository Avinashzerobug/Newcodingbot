package com.source.overriding;

public class Director {

	
	public String name;
	public int    noOfFilms;
	
	public Director(String name, int noOfFilms)
	{
		super();
		this.name = name;
		this.noOfFilms = noOfFilms;
	}
	
	
	
	
	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.noOfFilms);
		
		
	}
	
	
	
	
	
}
