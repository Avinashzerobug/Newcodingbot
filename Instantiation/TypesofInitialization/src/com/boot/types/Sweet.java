package com.boot.types;
import com.boot.types.Enum.Tasty;
public class Sweet {
	
	
	public static final String shopOwnerName = "Ali Ba Ba";
	public  String name;
	public double price;
	public Tasty location;
	public int    noOfSweets;
	
	
	
	public Sweet(String name)
	{
		this.name = name;
	
	}
	
	
	
	public void Diwali(double price)
	{
		this.price = price;
		
	}
	
	public Sweet(Tasty location)
	{
	
		this.location = location;
		
	}
	
	
	public void show()
	{
		System.out.println("Shop Owner Name:"+shopOwnerName);
		System.out.println("Price:"+price);
		System.out.println("Location:"+location);
		System.out.println("Name:"+name);
		System.out.println("No Of Brands:"+noOfSweets);
	}
	

}
