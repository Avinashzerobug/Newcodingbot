package com.source.overriding;



public class ShoppingMall  {
	public String ownerName;
	public int    noOfShopsInMall;
	
	
	public ShoppingMall(String ownerName, int noOfShopsInMall)
	{
		super();
		this.ownerName = ownerName;
		this.noOfShopsInMall = noOfShopsInMall;
	}
	
	
	
	public void show() {
		
		System.out.println(this.ownerName);
		System.out.println(this.noOfShopsInMall);
		
		
		
	}
	


	
	
	
	
	
	
	
}
