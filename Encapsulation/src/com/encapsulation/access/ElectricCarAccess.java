package com.encapsulation.access;

public class ElectricCarAccess {
	
	
	ElectricCar electric=new ElectricCar();
	
	public void elonMusk(ElectricCar electric)
	{	
	
	
	
	
	System.out.println(electric.getName());
	electric.setName("Range Rover");
	System.out.println(electric.getName());

	System.out.println(electric.getSeries());
	electric.setSeries("Velar");
	System.out.println(electric.getSeries());
	
	System.out.println(electric.getCompany());
	electric.setCompany("TATA");
	System.out.println(electric.getCompany());
	
	System.out.println(electric.getNoOfVersion());
	electric.setNoOfVersion(007);
	System.out.println(electric.getNoOfVersion());
	
	System.out.println(electric.isReadiator());
	electric.setReadiator(false);
	System.out.println(electric.isReadiator());
	
	System.out.println(electric.getMilage());
	electric.setMilage(17);
	System.out.println(electric.getMilage());
	
	System.out.println(electric.getAi());
	electric.setAi("Alexa");
	System.out.println(electric.getAi());
	
	System.out.println(electric.getBattery());
	electric.setBattery("Turbo Engine");
	System.out.println(electric.getBattery());
	
	System.out.println(electric.getSpeed());
	electric.setSpeed("Medium");
	System.out.println(electric.getSpeed());
	
	System.out.println(electric.getSpeed());
	electric.setSpeed("Rocket");
	System.out.println(electric.getSpeed());
	
	System.out.println(electric.getTireName());
	electric.setTireName("Good Year");
	System.out.println(electric.getTireName());
	
	}

}
