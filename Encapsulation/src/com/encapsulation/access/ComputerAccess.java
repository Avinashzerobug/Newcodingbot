package com.encapsulation.access;

public class ComputerAccess {

	Computer computer;
	
	
	public void comp(Computer computer)
	{
	
	
	
	System.out.println(computer. getName());
	computer.setName("ZODIAC");
	System.out.println(computer. getName());
	
	System.out.println(computer. getSeries());
	computer.setSeries(1080);
	System.out.println(computer. getSeries());
	
	System.out.println(computer. getCompany());
	computer.setCompany("NVIDIA");
	System.out.println(computer. getCompany());
	
	System.out.println(computer. getNoOfVersion());
	computer.setNoOfVersion(1090);
	System.out.println(computer. getNoOfVersion());
	
	System.out.println(computer. isReadiator());
	computer.setReadiator(false);
	System.out.println(computer. isReadiator());
	
	System.out.println(computer. getFps());
	computer.setFps(120);
	System.out.println(computer. getFps());
	
	System.out.println(computer. getChipSet());
	computer.setChipSet("AMD");
	System.out.println(computer. getChipSet());
	
	System.out.println(computer. getGraphicsEngine());
	computer.setGraphicsEngine("Poerfull");
	System.out.println(computer. getGraphicsEngine());
	
	System.out.println(computer. getMemoryInterface());
	computer.setMemoryInterface(500);
	System.out.println(computer. getMemoryInterface());
	
	System.out.println(computer. getSpeed());
	computer.setSpeed("Faster");
	System.out.println(computer. getSpeed());
	

	computer.setProcessor("INTEL");
	System.out.println(computer. getProcessor());
	
}
}