package com.source.overriding;

public class Satellite {

	public double distanceBetweenEarthAndMoon;
	public boolean isMoonLooksRound;
	
	
	
	
	
	public Satellite(double distanceBetweenEarthAndMoon, boolean isMoonLooksRound) {
		super();
		this.distanceBetweenEarthAndMoon = distanceBetweenEarthAndMoon;
		this.isMoonLooksRound = isMoonLooksRound;
	}
	
	
	
	
	public void see()
	{
		System.out.println(this.distanceBetweenEarthAndMoon);
		System.out.println(this.isMoonLooksRound);
		
	}
	
	
	
	
	
}
