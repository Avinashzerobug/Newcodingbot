package com.encapsulation.access;

public class CarAccess {
	
	Car car;
	
	public void benz(Car car)
	
	{
		
		System.out.println(car.getName());
		car.setName("Range Rover");
		System.out.println(car.getName());

		System.out.println(car.getSeries());
		car.setSeries("Velar");
		System.out.println(car.getSeries());
		
		System.out.println(car.getCompany());
		car.setCompany("TATA");
		System.out.println(car.getCompany());
		
		System.out.println(car.getNoOfVersion());
		car.setNoOfVersion(007);
		System.out.println(car.getNoOfVersion());
		
		System.out.println(car.isReadiator());
		car.setReadiator(false);
		System.out.println(car.isReadiator());
		
		System.out.println(car.getMilage());
		car.setMilage(17);
		System.out.println(car.getMilage());
		
		System.out.println(car.getAi());
		car.setAi("Alexa");
		System.out.println(car.getAi());
		
		System.out.println(car.getEngineName());
		car.setEngineName("Turbo Engine");
		System.out.println(car.getEngineName());
		
		System.out.println(car.getEngineWeight());
		car.setEngineWeight(560);
		System.out.println(car.getEngineWeight());
		
		System.out.println(car.getSpeed());
		car.setSpeed("Rocket");
		System.out.println(car.getSpeed());
		
		System.out.println(car.getTireName());
		car.setTireName("Good Year");
		System.out.println(car.getTireName());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
