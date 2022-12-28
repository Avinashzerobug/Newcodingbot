package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.source.collection.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HolidayDTO dto1 = new HolidayDTO("Fever and Cough",6,true);
	HolidayDTO dto2 = new HolidayDTO("Enjoyment",6,false);	
	HolidayDTO dto3 = new HolidayDTO("Fever and Cough",6,true);
	HolidayDTO dto4 = new HolidayDTO("just bored",6,true);	
	HolidayDTO dto5 = new HolidayDTO("Fever and Cough",6,true);	
	
		Collection<HolidayDTO> collection = new ArrayList<HolidayDTO>();
		collection.add(dto5);
		collection.add(dto3);
		
		boolean ref = collection.contains(dto1);
		System.out.println("contains:"+ref);
		
		
		
		
		
		
		
	}

}
