package com.boot.types;
import com.boot.types.Enum.Rose;

public class Flower {
	
	
	public static final String shopOwnerName = "Laxmi";
	public  String name;
	public double price;
	public Rose location;
	public int    noOfFlowers;
	
	
	
	public Flower(String name)
	{
		this.name = name;
	
	}
	
	
	
	public void Diwali(double price)
	{
		this.price = price;
		
	}
	
	public Flower(Rose location)
	{
	
		this.location = location;
		
	}
	
	
	public void show()
	{
		System.out.println("Shop Owner Name:"+shopOwnerName);
		System.out.println("Price:"+price);
		System.out.println("Location:"+location);
		System.out.println("Name:"+name);
		System.out.println("No Of Brands:"+noOfFlowers);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
