package com.boot.types;

import com.boot.types.Enum.Brands;

public class ShirtBrand {
	

	public static String shopOwnerName;
	public  final String name = "Shirt";
	public double price;
	public Brands location;
	public int    noOfBrands;
	
	
	public ShirtBrand (Brands location)
	{
		
		this.location = location;
	}
	
	static {
		
		shopOwnerName = "Chris Evan";
	}
	
	 
	public void setPrice(double price)
	{
		this.price = price;
		
	}
	

	
	public void show()
	{
		System.out.println("Shop Owner Name:"+shopOwnerName);
		System.out.println("Price:"+price);
		System.out.println("Location:"+location);
		System.out.println("Name:"+name);
		System.out.println("No Of Brands:"+noOfBrands);
	}
	

	

}
