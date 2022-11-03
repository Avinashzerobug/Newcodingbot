package com.encapsulation.access.nun;

import com.encapsulation.access.Computer;
import com.encapsulation.access.ComputerAccess;

public class ComputerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Computer com = new Computer();
		ComputerAccess ac = new ComputerAccess();
			
		System.out.println(com. getName());
		System.out.println(com. getSeries());
		System.out.println(com. getCompany());
		System.out.println(com. getNoOfVersion());
		System.out.println(com. isReadiator());
		System.out.println(com. getFps());
		System.out.println(com. getChipSet());
		System.out.println(com. getMemoryInterface());
		System.out.println(com. getGraphicsEngine());
		System.out.println(com. getSpeed());
		System.out.println(com. getProcessor());
		
		System.out.println(System.lineSeparator());
		
		ac.comp(com);
		
		
		
		
		
		
		
		
		
	}

}
