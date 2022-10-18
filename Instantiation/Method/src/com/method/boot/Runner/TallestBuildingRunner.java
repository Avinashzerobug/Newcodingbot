package com.method.boot.Runner;

import com.method.boot.TallestBuildings;

public class TallestBuildingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String[] items1 = {"Apartment","House","Bungalow","Condominium"};
		String[] items2 = {"Duplex","Silo","Ranxh-style"};
		String[] items3 = {"Package Builders","General Contractors","Sponser Builders","Ranxh-style"};
		double[] items4 = {34055.0,153340.0,2435000.0};
		long[]   items5 = {13458345,79454345,14553545};
		String[] items6 = {"India","Dubai","USA"};
		
		TallestBuildings Town = new TallestBuildings("Bhurj Khalifa","Tower","Adriana Smith",1,true,items1,items2,items3,items4,items5,items6);
		
		Town.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
