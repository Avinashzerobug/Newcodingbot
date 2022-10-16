package com.Instantiation.boot;

public class Chain {
	
	public char type;
	public long price;
	public int length;
	public String material;
	public double weight;;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;

	public Chain()
	{
		System.out.println("///////******/////////");
	}
	
	public Chain(char type)
	{
		this();
		this.type = type;
		
	}
	
	public Chain(char type,long price)
	{
		this(type);
		this.price = price;
		
	}
	
	public Chain(char type,long price,int length)
	{
		this(type,price);
		this.length = length;
		
	}
	
	public Chain(char type,long price,int length,String material)
	{
		this(type,price,length);
		this.material = material;
	}
	
	public Chain(char type,long price,int length,String material,boolean stolen)
	{
		this(type,price,length,material);
		this.stolen = stolen;
	}
	
	public Chain(char type,long price,int length,String material,boolean stolen,String usedFor)
	{
		this(type,price,length,material,stolen);
		this.usedFor = usedFor;
	}
	
	public Chain(char type,long price,int length,String material,boolean stolen,String usedFor,boolean fresh)
	{
		this(type,price,length,material,stolen,usedFor);
		this.fresh = fresh;
		
	}
	
	public Chain(char type,long price,int length,String material,boolean stolen,String usedFor,boolean fresh,double weight)
	{
		this(type,price,length,material,stolen,usedFor,fresh);
		this.weight = weight;
		
	}
	
}
