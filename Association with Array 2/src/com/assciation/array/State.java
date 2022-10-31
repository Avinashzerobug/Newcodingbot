package com.assciation.array;

public class State {

	public String name;
	public String countryName;
	public long   area;
	public int    noOfCompanies;
	
	
	
	

	
	
	public void stay(String name,String countryName,int noOfCompanies,long area)
	{
		this.name = name;
		this.countryName = countryName;
		this.noOfCompanies = noOfCompanies;
		this.area = area;
	}
	
	
	
	public void showMe()
	{
		  System.out.println("Country name,state and its area");
			System.out.println("************************************************************");
			
		System.out.println(this.name);
		System.out.println(this.countryName);
		 
		System.out.println(this.area);
		 
		System.out.println(this.noOfCompanies);
		System.out.println(System.lineSeparator()); 
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
