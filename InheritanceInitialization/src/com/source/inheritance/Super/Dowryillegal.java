package com.source.inheritance.Super;

import com.source.inheritance.Dowry;

public class Dowryillegal extends Dowry {

	public Dowryillegal(String goldName, int howMuchMoney, boolean isItLegal) {
		super(goldName, howMuchMoney, isItLegal);
		// TODO Auto-generated constructor stub
	}

	
	public void see()
	{
		System.out.println(this.goldName);
		System.out.println(this.howMuchMoney);
		System.out.println(this.isItLegal);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
