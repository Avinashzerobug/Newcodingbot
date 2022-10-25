package com.boot.types;
import com.boot.types.Enum.Mazaa;

public class Mango {
	
	

	public static String shopOwnerName;
	public  final String name = "Yumm";
	public double price;
	public Mazaa location;
	public int    noOfMango;
	
	
	public Mango (Mazaa location)
	{
		
		this.location = location;
	}
	
	static {
		
		shopOwnerName = "Kallya";
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
		System.out.println("No Of Brands:"+noOfMango);

	}
	

	
	
	

}
