package com.encapsulation.access.nun;

import com.encapsulation.access.ChipSet;
import com.encapsulation.access.ChipSetAccess;

public class ChipSetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChipSet chip = new ChipSet();
		ChipSetAccess set = new ChipSetAccess();
		
		System.out.println(chip. getName());
		System.out.println(chip. getSeries());
		System.out.println(chip. getCompany());
		System.out.println(chip. getNoOfVersion());
		System.out.println(chip. isReadiator());
		System.out.println(chip. getFps());
		System.out.println(chip. getChipSet());
		System.out.println(chip. getGraphicsEngine());
		System.out.println(chip. getMemoryInterface());
		System.out.println(chip. getSpeed());
		System.out.println(chip. getProcessor());
		
		
		System.out.println(System.lineSeparator());
		
		set.chipy(chip);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
