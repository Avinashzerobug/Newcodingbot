package com.encapsulation.access;

public class MobileRunner {

	Mobile mobile;
	
	public void moby(Mobile mobile)
	{

	System.out.println(mobile. getName());
	mobile.setName("ZODIAC");
	System.out.println(mobile. getName());
	
	System.out.println(mobile. getSeries());
	mobile.setSeries(1080);
	System.out.println(mobile. getSeries());
	
	System.out.println(mobile. getCompany());
	mobile.setCompany("AMD");
	System.out.println(mobile.getCompany());
	
	System.out.println(mobile. getNoOfVersion());
	mobile.setNoOfVersion(1090);
	System.out.println(mobile. getNoOfVersion());
	
	System.out.println(mobile. isReadiator());
	mobile.setReadiator(true);
	System.out.println(mobile. isReadiator());
	
	System.out.println(mobile. getFps());
	mobile.setFps(60);
	System.out.println(mobile. getFps());
	
	System.out.println(mobile. getChipSet());
	mobile.setChipSet("AMD");
	System.out.println(mobile. getChipSet());
	
	System.out.println(mobile. getGraphicsEngine());
	mobile.setGraphicsEngine("Low PowerFull");
	System.out.println(mobile. getGraphicsEngine());
	
	System.out.println(mobile. getMemoryInterface());
	mobile.setMemoryInterface(500);
	System.out.println(mobile. getMemoryInterface());
	
	System.out.println(mobile. getSpeed());
	mobile.setSpeed("Faster");
	System.out.println(mobile. getSpeed());
	

	System.out.println(mobile. getProcessor());
	mobile.setProcessor("intel");
	System.out.println(mobile. getProcessor());
	
	
	}

}
