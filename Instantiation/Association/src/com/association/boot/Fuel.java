package com.association.boot;
import com.association.boot.Enum.FuelType;
import com.association.boot.associating.Brand;

public class Fuel {

	public boolean special;
	public int     price;
	public double  quantity;
	public FuelType type;
	public Brand  jet = new Brand("Petrol",45465);
	
	
	public Fuel()
	{
		
	}
	
	public void white(boolean special,int price,double quantity,FuelType type)
	{
		this.special = special;
		this.price= price;
		this.quantity = quantity;
		this.type = type;
		
		if(jet!=null)
		{
			jet.brand();
			System.out.println("Checking the types of fuel");
		}
		else
		{
			System.out.println("Welcome to the World");
			
		}
		
	}
	
	public void show()
	{
		
		System.out.println(this.special);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
		System.out.println("**************************");
		jet.showOff();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
