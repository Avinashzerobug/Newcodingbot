package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.source.collection.Calender;

public class CalenderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Calender dto1 = new Calender("Lakshmi",12,2023);	
	Calender dto2 = new Calender("Shree Lakshmi",13,2023);	
    Calender dto3 = new Calender("Lakshmi",14,2023);	
    Calender dto4= new Calender("San com",14,2023);		
	Calender dto5= new Calender("Lakshmi",15,2023);	
	
		
	Collection<Calender> collection = new ArrayList<Calender>();
	collection.add(dto3);
	
	boolean ref =collection.contains(dto4);
	System.out.println("contains:"+ref);	
		
		
		
		
		
		
		
		
		
		
		
	}

}
