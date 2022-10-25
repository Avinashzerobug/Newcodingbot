package com.boot.types;
import com.boot.types.Enum.Cow;
public class Milk {
	

	public static String shopOwnerName;
	public  final String name = "Cow";
	public double price;
	public Cow location;
	public int    noOfMilks;
	
	
	public Milk (Cow location)
	{
		
		this.location = location;
	}
	
	static {
		
		shopOwnerName = "Mallu";
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
		System.out.println("No Of Brands:"+noOfMilks);
	}
	

	
	
}
