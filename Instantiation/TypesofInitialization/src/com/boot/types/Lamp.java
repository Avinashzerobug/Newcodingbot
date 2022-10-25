package com.boot.types;
import com.boot.types.Enum.LampE;
public class Lamp {

	
	public static String shopOwnerName;
	public  final String name = "Kalli";
	public double price;
	public LampE location;
	public int    noOfLamp;
	
	
	public Lamp (LampE location)
	{
		
		this.location = location;
	}
	
	static {
		
		shopOwnerName = "Basya";
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
		System.out.println("No Of Brands:"+noOfLamp);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
