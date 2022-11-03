package com.encapsulation.access;

public class Station {
	
	public SpaceStation spaceStation;

	
	public void galaxy(SpaceStation spaceStation)
	{
		System.out.println(spaceStation.getWeight());
		spaceStation.setWeight(569.9);
		System.out.println(spaceStation.getWeight());
		
		System.out.println(spaceStation.getName());
		spaceStation.setName("ISRO");
		System.out.println(spaceStation.getName());
		
		System.out.println(spaceStation.getCountry());
		spaceStation.setCountry("INDIA");
		System.out.println(spaceStation.getCountry());
		
		System.out.println(spaceStation.getNoOfDocking());
		spaceStation.setNoOfDocking(5);
		System.out.println(spaceStation.getNoOfDocking());
		
		System.out.println(spaceStation.getHabitaleVolume());
		spaceStation.setHabitaleVolume(600);
		System.out.println(spaceStation.getHabitaleVolume());
		
		System.out.println(spaceStation. getAstronauts());
		spaceStation. setAstronauts("Buzz Aldrin");
		System.out.println(spaceStation. getAstronauts());
		
		System.out.println(spaceStation. isMorePower());
		spaceStation. setMorePower(false);
		System.out.println(spaceStation. isMorePower());
		
		System.out.println(spaceStation. getSpaceCraftName());
	   spaceStation. setSpaceCraftName("FALCON_9");
	   System.out.println(spaceStation. getSpaceCraftName());
	   
	   System.out.println(spaceStation.getGravity());
	   spaceStation.setGravity(9.89);
	   System.out.println(spaceStation.getGravity());
	   
	   System.out.println(spaceStation.getLength());
	   spaceStation.setLength(56);
	   System.out.println(spaceStation.getLength());
	   
	   System.out.println(spaceStation.getOrganisation());
	   spaceStation.setOrganisation("ISRO");
	   System.out.println(spaceStation.getOrganisation());
	   
	   System.out.println(spaceStation.getWeight());
	   spaceStation.setWeight(700);
	   System.out.println(spaceStation.getWeight());
	   
	}

	
	
}
