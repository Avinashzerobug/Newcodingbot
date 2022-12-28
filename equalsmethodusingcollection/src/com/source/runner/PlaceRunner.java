package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.source.collection.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlaceDTO dto1 = new PlaceDTO("Bagalkot","Rotti","India");
		PlaceDTO dto2 = new PlaceDTO("Bagalkot","Katag rotti","India");
		PlaceDTO dto3 = new PlaceDTO("Bagalkot","Rotti","India");
		PlaceDTO dto4 = new PlaceDTO("Bagalkot","chana masala","India");		
		PlaceDTO dto5 = new PlaceDTO("Bangalore","Mudde","India");
		
		Collection<PlaceDTO> collection = new ArrayList<PlaceDTO>();
		collection.add(dto3);
		collection.add(dto2);
		
		boolean ref=collection.contains(dto1);
		System.out.println("contains:"+ref);
		
		
		
		
		
		
		
	}

}
