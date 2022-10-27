package com.association.boot.associating;

public class Brand {

	public String name;
	public long   gstNo;
	public int    rating;
	public Location loc;
	
	
	
	
	
	public Brand(String name,long gstNo)
	{
		this.name = name;
		this.gstNo = gstNo;
		
	}
	
	
	
	public void brand()
	{
		
		if(loc!=null)
		{
			System.out.println("locating the adress");
		}
		else
		{
			System.out.println("Welcome to the Null World");
			System.out.println("*****************************");
		}
	}	
    	public void showOff()
	{
         System.out.println(this.name);		
		 System.out.println(this.gstNo);
	
	}
		
		
		
	}
	
	
	

