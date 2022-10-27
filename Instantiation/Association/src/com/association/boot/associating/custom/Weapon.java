package com.association.boot.associating.custom;

public class Weapon {

	
	public String name;
	public String use;
	public long   weight;
	
	
	
	
	public Weapon()
	{
		
	}
	
	public void weapon(String name,String use,long weight)
	{
		this.name = name;
		this.use = use;
		this.weight =weight;
		
	}
	
	public void see()
	{
		System.out.println(this.name);
		System.out.println(this.use);
		System.out.println(this.weight);
	}
	
	
}
