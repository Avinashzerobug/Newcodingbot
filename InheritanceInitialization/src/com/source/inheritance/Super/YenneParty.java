package com.source.inheritance.Super;

import com.source.inheritance.BacheloreParty;

public class YenneParty extends BacheloreParty {

	public YenneParty(String brandName, boolean isYenneAvailable, int noOfMembers) {
		super(brandName, isYenneAvailable, noOfMembers);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void display()
	{
		System.out.println(this.brandName);
		System.out.println(this.isYenneAvailable);
		System.out.println(this.noOfMembers);
		
		
		
	}
	
	
	
	

}
