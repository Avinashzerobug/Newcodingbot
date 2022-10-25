package com.boot.types;
import com.boot.types.Enum.Cracks;
public class Cracker {
	
	public static String shopOwnerName;
	public  final String name = "Kulli";
	public double price;
	public Cracks location;
	public int    noOfCrackers;
	
	
	public Cracker (Cracks location)
	{
		
		this.location = location;
	}
	
	static {
		
		shopOwnerName = "Huliya";
	}
	
	
	public void Diwali(double price)
	{
		this.price = price;
		
	}
	
	
	
	
	public void show()
	{
		System.out.println("Shop Owner Name:"+shopOwnerName);
		System.out.println("Price:"+price);
		System.out.println("Location:"+location);
		System.out.println("Name:"+name);
		System.out.println("No Of Brands:"+noOfCrackers);
	}
	

	
	
	
	
	
	

}
