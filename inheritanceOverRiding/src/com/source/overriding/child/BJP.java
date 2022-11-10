package com.source.overriding.child;

import com.source.overriding.PoliticalParty;

public class BJP extends PoliticalParty {

	
	public String name;
	
	public BJP(String type, int noOfPoliticalParty,String name) {
		super(type, noOfPoliticalParty);
		this.name = name;
	}

	
	
  public void display()
  {
	  
	  System.out.println(this.name);
	  super.display();
	  
	  
  }
	
	
	
	
	
	
	
	
	
}
