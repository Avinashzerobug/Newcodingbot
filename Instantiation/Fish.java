package com.Instantiation.boot;

public class Fish {

	public String name;
	public String type;
	public int    price;
	public double weight;
	public int    length;
	
	
	public Fish(String name,int price)
	{
		 this.name=name;
		 this.price=price;
	    System.out.println("Checking the name and price of the fish");
		
	}
	
	public Fish(double weight,String type)
	{
	 this.weight=weight;
	 this.type=type;
		System.out.println("Checking the weight and type of fish");
	}
	
	public Fish(int length,String name)
	{
		 this.length=length;
		 this.name=name;
		System.out.println("Checking the length and name of the fish");
	}

	public Fish(String type,double weight,int price)
	{
		 this.type=type;
		 this.weight=weight;
		 this.price=price;
		System.out.println("Checking the type,weight and price of the Fish");
	}
	
	public Fish(int price,String type,double weight)
	{
		 this.price=price;
		 this.type=type;
		this.weight=weight;
		System.out.println("Checking the price,type and weight of the Fish");
	}
	
	public Fish(int length,int price,String type)
	{
		this.length=length;
	    this.price=price;
	    this.type=type;
		System.out.println("Checking the length,price,type of the Fish");
		
	}
	
	public Fish(double weight,int price,String type,int length)
	{
		 this.weight=weight;
		 this.price=price;
		 this.type=type; 
		 this.length=length;
		System.out.println("Checking the weight,price,type and length of the Fish");
	}
	
	public Fish(int length,String type,int price,double weight)
	{
		 this.length=length;
		 this.type=type;
		 this.price=price;
		 this.weight=weight;
		System.out.println("Cheking the length,type,price and weight of the Fish");
	}
}
