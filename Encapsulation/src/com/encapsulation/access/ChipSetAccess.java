package com.encapsulation.access;

public class ChipSetAccess {

	
	ChipSet chip;
	
	public void chipy(ChipSet chip)
	{

	System.out.println(chip. getName());
	chip.setName("ZODIAC");
	System.out.println(chip. getName());
	
	System.out.println(chip. getSeries());
	chip.setSeries(1080);
	System.out.println(chip. getSeries());
	
	System.out.println(chip. getCompany());
	chip.setCompany("AMD");
	System.out.println(chip. getCompany());
	
	System.out.println(chip. getNoOfVersion());
	chip.setNoOfVersion(1090);
	System.out.println(chip. getNoOfVersion());
	
	System.out.println(chip. isReadiator());
	chip.setReadiator(true);
	System.out.println(chip. isReadiator());
	
	System.out.println(chip. getFps());
	chip.setFps(60);
	System.out.println(chip. getFps());
	
	System.out.println(chip. getChipSet());
	chip.setChipSet("AMD");
	System.out.println(chip. getChipSet());
	
	System.out.println(chip. getGraphicsEngine());
	chip.setGraphicsEngine("Low PowerFull");
	System.out.println(chip. getGraphicsEngine());
	
	System.out.println(chip. getMemoryInterface());
	chip.setMemoryInterface(500);
	System.out.println(chip. getMemoryInterface());
	
	System.out.println(chip. getSpeed());
	chip.setSpeed("Faster");
	System.out.println(chip. getSpeed());
	

	System.out.println(chip. getProcessor());
	chip.setProcessor("intel");
	System.out.println(chip. getProcessor());
	

	}
	
	
	
	
}
