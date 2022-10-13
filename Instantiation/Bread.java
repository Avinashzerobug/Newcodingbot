package com.Instantiation.boot;

public class Bread {

	public char type;
	public String shape;
	public int price;
	public double quantity;
	public String companyName;

	public Bread(char type)
	{
		this.type=type;
		System.out.println("type of Bread");
	}
	
	public Bread(String shape)
	{
		this.shape=shape;
		System.out.println("shape of Bread");
	}
	
	public Bread(int price)
	{
		this.price = price;
		System.out.println("price of the Bread");
	}
	
	public Bread(double quantity)
	{
		this.quantity = quantity;
		System.out.println("Quantity of the Bread");
	}
	
	public Bread(String companyName,char type)
	{
	   this.companyName = companyName;
	   this.type = type;
	   System.out.println("type of Bread");
	   System.out.println("Company name of the Bread");
	}
	
	public Bread(double quantity,int price)
	{
		this.quantity = quantity;
		this.price = price;
		System.out.println("Quantity of the Bread");
		System.out.println("Price of the Bread");
	}
	
	public Bread(int price,char type)
	{
		this.price = price;
		this.type = type;
		System.out.println("Price of the Bread");
		System.out.println("type of the Bread");
	}
	public  Bread(String shape,double quantity)
	{
		this.shape=shape;
		this.quantity=quantity;
		System.out.println("shape of the Bread");
		System.out.println("Quantity of the Bread");
	}
	
	
}
