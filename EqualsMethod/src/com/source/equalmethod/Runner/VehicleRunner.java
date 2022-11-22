package com.source.equalmethod.Runner;

import com.source.equalmethod.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle vehicle = new Vehicle("Nexon",945500,"TATA","Grey",true,"Ratan tata",1956,"Gurugam",1000000,true);
		System.out.println(vehicle);
		
		
		System.out.println(System.lineSeparator());
		
		
		Vehicle vehicle2 = new Vehicle("Nexon",945500,"TATA","RED",true,"Ratan tata",1970,"Belagavi",645656,true);
		System.out.println(vehicle2);
		System.out.println(System.lineSeparator());
		
	
		boolean vehi = vehicle.equals(vehicle2);
		System.out.println(vehi);
		
		vehicle = vehicle2;
	}

}
