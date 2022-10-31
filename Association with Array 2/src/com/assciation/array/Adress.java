package com.assciation.array;

public class Adress {

	
	public Location location = new Location();

	
	
	public void display()
	{
		if(location!=null)
		{
			location.locate("Majastic",44543);
			
			location.showUs();
		}
		else
		{
			System.out.println("Welcome to the  Null World");
		}
		
		
	}
	
	
	
	
}
