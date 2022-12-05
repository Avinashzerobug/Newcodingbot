package com.source.abstraction;

public class TestingCar {

	Car car;

	public TestingCar(Car car) {
		super();
		this.car = car;
	}
	
	public TestingCar()
	{
		
	}
	
	
	
	
	public void checking()
	{
		if(car!=null)
		{
 		   boolean testing = this.car.engineWorking();
 		   
			if(testing==true&&testing==true&&testing==false)
			{
				System.out.println("All part of the car and features are working well");
			}
			else
			{
				System.out.println("there something issue in the car");
			}
		}
		
		
		
		
	}
	
	
	
}
