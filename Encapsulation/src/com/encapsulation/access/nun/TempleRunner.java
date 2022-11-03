package com.encapsulation.access.nun;

import com.encapsulation.access.Temple;
import com.encapsulation.access.TempleAccess;

public class TempleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Temple temp = new Temple();
	TempleAccess acc = new TempleAccess();
		
	System.out.println(temp. getName());	
	System.out.println(temp. getNoOfBhakts());	
	System.out.println(temp. getNoOfVersion());
	System.out.println(temp. getTrust());	
	System.out.println(temp. getParkingArea());	
	System.out.println(temp. getTiming());	
	System.out.println(temp. getNoOfBells());	
	System.out.println(temp. getGodName());	
	System.out.println(temp. getFestival());			
	System.out.println(temp. getHotelsNearTemple());
	System.out.println(temp. getMemoryInterface());	
		
		
	System.out.println(System.lineSeparator());	
		
	acc.tem(temp);
		
		
		
		
		
		
		
		
		
		
		
	}

}
