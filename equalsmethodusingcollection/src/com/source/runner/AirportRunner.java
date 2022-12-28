package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.source.collection.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirportDTO dto1 = new AirportDTO("Air India",200,"Bangalore");
		AirportDTO dto2 = new AirportDTO("Vistara",200,"Bagalkot");
		AirportDTO dto3 = new AirportDTO("Emirates",200,"Bangalore");
		AirportDTO dto4 = new AirportDTO("Air India",200,"Hubli");	
		AirportDTO dto5 = new AirportDTO("King Fisher",200,"Bagalkot");
		
		
		Collection<AirportDTO> collection = new ArrayList<AirportDTO>();
		collection.add(dto5);
		collection.add(dto1);
		
		boolean ref=collection.contains(dto2);
		boolean ref2=collection.contains(dto4);
	   
	    System.out.println("contain:"+ref);	
	    System.out.println(System.lineSeparator());
		System.out.println(ref2);
		
		
	}

}
