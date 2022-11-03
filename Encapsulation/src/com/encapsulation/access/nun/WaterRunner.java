package com.encapsulation.access.nun;

import com.encapsulation.access.WaterBottle;
import com.encapsulation.access.WaterBottleAccess;

public class WaterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WaterBottle wat = new WaterBottle();
		WaterBottleAccess acc = new WaterBottleAccess();
		
		
		System.out.println(wat. getName());
		System.out.println(wat. getSeries());
		System.out.println(wat. getCompany());
		System.out.println(wat. getNoOfBottlePerSec());
		System.out.println(wat. isReadiatorInFactory());
		System.out.println(wat. getProductionPlant());
		System.out.println(wat. getChipSet());
		System.out.println(wat. getFactoryName());
		System.out.println(wat. getEmployee());
		System.out.println(wat. getPurity());
		
		System.out.println(System.lineSeparator());
		
		acc.bot(wat);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
