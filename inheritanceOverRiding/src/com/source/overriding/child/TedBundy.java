package com.source.overriding.child;

import com.source.overriding.Criminal;

public class TedBundy extends Criminal {

	
	public String killerName;
	
	
	public TedBundy(String type, int ageOfKiller,String killerName) {
		super(type, ageOfKiller);
		this.killerName = killerName;
		// TODO Auto-generated constructor stub
	}

	
	
	public void see()
	{
		System.out.println(this.killerName);
		super.see();
		
	}
	
	
	
	
	
	
}
