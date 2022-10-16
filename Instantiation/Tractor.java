package com.Instantiation.boot;

public class Tractor {

	public String name;
	public String brand;
	public double price;
	public String color;
	public int    hp;
	public char   model;
	
	
	public Tractor()
	{
		System.out.println("//////////////////////////////////////");
	}
	
	public Tractor(String name)
	{
		this();
		this.name = name;
	    
	}
	
	public Tractor(String name,String brand)
	{
		this(name);
		this.brand = brand;
		
	}
	
	public Tractor(String name,String brand,double price)
	{
		this(name,brand);
		this.price = price;
	}
	
	public Tractor(String name,String brand,double price,String color)
	{
		this(name,brand,price);
		this.color = color;
	}
	
	public Tractor(String name,String brand,double price,String color,int hp)
	{
		this(name,brand,price,color);
		this.hp = hp;
	}
	
	public Tractor(String name,String brand,double price,String color,int hp,char model)
	{
	    this(name,brand,price,color,hp);	
	    this.model = model;
	
	}
	
	

	
}


























