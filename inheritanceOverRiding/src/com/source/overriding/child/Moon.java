package com.source.overriding.child;

import com.source.overriding.Satellite;

public class Moon extends Satellite {

	
	public int moonMission;
	
	public Moon(double distanceBetweenEarthAndMoon, boolean isMoonLooksRound,int moonMission) {
		super(distanceBetweenEarthAndMoon, isMoonLooksRound);
		this. moonMission= moonMission;
		// TODO Auto-generated constructor stub
	}

	
	public void see()
	{
		super.see();
		
		System.out.println(this. moonMission);
	}
	
	
	
	
	
	
	
}
