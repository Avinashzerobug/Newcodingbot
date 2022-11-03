package com.encapsulation.access.nun;

import com.encapsulation.access.PhotoGraph;
import com.encapsulation.access.PhotographAccess;

public class PhotoGraphRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		PhotoGraph pi = new PhotoGraph();
		PhotographAccess acc = new PhotographAccess();
		
		System.out.println(pi. getName());
		System.out.println(pi. getSeries());	
		System.out.println(pi. getCompany());	
		System.out.println(pi. getNoOfVersion());	
		System.out.println(pi. isReadiator());	
		System.out.println(pi. getFps());	
		System.out.println(pi. getChipSet());	
		System.out.println(pi. getGraphicsEngine());	
		System.out.println(pi. getMemoryInterface());	
		System.out.println(pi. getSpeed());
		System.out.println(pi. getProcessor());
		
		
		System.out.println(System.lineSeparator());
		
		acc.pic(pi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
