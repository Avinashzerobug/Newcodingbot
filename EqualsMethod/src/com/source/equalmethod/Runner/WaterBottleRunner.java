package com.source.equalmethod.Runner;

import com.source.equalmethod.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaterBottle water = new WaterBottle("Himalayan",60,"TATA","Color less",false,"Ratan Tata",1930,"Mumbai",456456,true);
		System.out.println(water);
		
		
		WaterBottle water2 = new WaterBottle("Himalayan",60,"TATA","White",true,"Ratan Tata",1930,"Mumbai",456456,false);
		System.out.println(water2);
		
		
		boolean bottle = water.equals(water2);
		System.out.println(bottle);
		
		
		
		
		
		
	}

}
