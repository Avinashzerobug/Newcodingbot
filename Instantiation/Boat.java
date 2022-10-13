package com.Instantiation.boot;

public class Boat {

	public String name;
	public String color;
	public String companyName;
	public char   type;
	public String owner;
	
	
	public Boat(String name,String color)
	{
		this.name = name;
		this.color = color;
		System.out.println("name and color of the Boat");
		
	}
	
	public Boat(String color,char type)
	{
		this.color = color;
		this.type = type;
		System.out.println("color and type of the Boat");
		
	}
	
	public Boat(char type,String owner)
	{
		this.type = type;
		this.owner = owner;
		System.out.println("type and owner of the Boat");
		
	}
	
	public Boat(String companyName,char type,String name )
	{
		this.companyName = companyName;
		this.type= type;
		this.name=name;
		System.out.println("companyName,type and name of the Boat");
	}
	
	public Boat(char type,String color,String owner)
	{
		this.type = type;
		this.color = color;
		this.owner = owner;
		System.out.println("type,color and owner of the boat");
	}
	
	public Boat(String companyName,String color,char type)
	{
		this.companyName = companyName;
		this.color = color;
		this.type = type;
		System.out.println("comapanyName,color and type of the Boat");
	}
	
	public Boat(String owner,String color,String name)
	{
		this.owner=owner;
		this.color=color;
		this.name=name;
		System.out.println("owner,color,name of the Boat");
	}
	
	public Boat(char type)
	{
		this.type = type;
		System.out.println("type of the Boat");
	}
	
}
