package com.source.methodoverriding.child;

import com.source.methodoverriding.HR;

public class Akshara extends HR {

	public String name;
	
	
	@Override
	public void humanResource()
	{
		System.out.println("lets check knowledge on human resource");
		
		super.humanResource();
	}
	

	
	
	
}
