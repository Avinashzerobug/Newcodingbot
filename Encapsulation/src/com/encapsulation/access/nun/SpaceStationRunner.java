package com.encapsulation.access.nun;

import com.encapsulation.access.SpaceStation;
import com.encapsulation.access.Station;


public class SpaceStationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpaceStation station = new SpaceStation();
		Station state = new Station();
		System.out.println(station.getWeight());
		System.out.println(station.getName());
		System.out.println(station.getCountry());
		System.out.println(station.getNoOfDocking());
		System.out.println(station.getHabitaleVolume());
		System.out.println(station. getAstronauts());
		System.out.println(station. isMorePower());
		System.out.println(station. getSpaceCraftName());
		   System.out.println(station.getGravity());
		   System.out.println(station.getLength());
		   System.out.println(station.getOrganisation());
		   System.out.println(station.getWeight());
		
		 System.out.println(System.lineSeparator());  
		  
          state.galaxy(station);
		
	} 
	
	

}
