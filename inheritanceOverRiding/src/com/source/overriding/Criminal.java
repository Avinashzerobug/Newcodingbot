package com.source.overriding;

public class Criminal {

	
	public String type;
	public int    ageOfKiller;
	
	
	public Criminal(String type, int ageOfKiller) {
		super();
		this.type = type;
		this.ageOfKiller = ageOfKiller;
	}
	
	
	public void see()
	{
		System.out.println(this.type);
		System.out.println(this.ageOfKiller);
		
	}
	
	
	
	
}
