package com.encapsulation.access;

public class WaterBottleAccess {

	public WaterBottle water;
	
	public void bot(WaterBottle water)
	{
	
	System.out.println(water. getName());
	water.setName("ZODIAC");
	System.out.println(water. getName());
	
	System.out.println(water. getSeries());
	water.setSeries(1080);
	System.out.println(water. getSeries());
	
	System.out.println(water. getCompany());
	water.setCompany("NVIDIA");
	System.out.println(water. getCompany());
	
	System.out.println(water. getNoOfBottlePerSec());
	water.setNoOfBottlePerSec(1090);
	System.out.println(water. getNoOfBottlePerSec());
	
	System.out.println(water. isReadiatorInFactory());
	water.setReadiatorInFactory(false);
	System.out.println(water. isReadiatorInFactory());
	
	System.out.println(water. getProductionPlant());
	water.setProductionPlant(120);
	System.out.println(water. getProductionPlant());
	
	System.out.println(water. getChipSet());
	water.setChipSet("AMD");
	System.out.println(water. getChipSet());
	
	System.out.println(water. getFactoryName());
	water.setFactoryName("Purity");
	System.out.println(water. getFactoryName());
	
	System.out.println(water. getEmployee());
	water.setEmployee(500);
	System.out.println(water. getEmployee());
	
	System.out.println(water. getPurity());
	water.setPurity("Faster");
	System.out.println(water. getPurity());
	
	System.out.println(water. getOwner());
	water.setOwner("Laxmikanth");
	System.out.println(water. getOwner());
}
}
