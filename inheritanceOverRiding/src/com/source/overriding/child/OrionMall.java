package com.source.overriding.child;

import com.source.overriding.ShoppingMall;

public class OrionMall extends ShoppingMall {
	
	
	public String ownerWifeName;
	
	public OrionMall(String ownerName, int noOfShopsInMall, String ownerWifeName) {
		super(ownerName, noOfShopsInMall);

		this.ownerWifeName = ownerWifeName;
		// TODO Auto-generated constructor stub
	}


	
	
	

	
	public void show()
	{
		System.out.println(this.ownerWifeName);
		super.show();
		
		
	}
	
	
	

}
