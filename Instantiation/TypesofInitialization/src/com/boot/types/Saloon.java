package com.boot.types;
import com.boot.types.Enum.Cutting;
public class Saloon {
	
	public static final String shopOwnerName = "Laxmikant";
	public  String name;
	public double price;
	public Cutting location;
	public int    noOfSaloons;
	
	

	
	public Saloon(String name)
	{
		this.name = name;
	
	}
	
	
	
	public void Diwali(double price)
	{
		this.price = price;
		
	}
	
	public Saloon(Cutting location)
	{
		
		this.location = location;
		
	}
	
	
	public void show()
	{
		System.out.println("Shop Owner Name:"+shopOwnerName);
		System.out.println("Price:"+price);
		System.out.println("Location:"+location);
		System.out.println("Name:"+name);
		System.out.println("No Of Brands:"+noOfSaloons);
	}
	
	
	
	
	
	

}
