package com.method.boot.Runner;

import com.method.boot.Tourism;

public class TourismRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items1 = {"Badami","Jog Falls","Hallur Basavanna","Banashankari Temple"};
		String[] items2 = {"Bagalkot","Shivmogga","Bagalkot"};
		String[] items3 = {"Mom ","Dad","Brother","Sister"};
		double[] items4 = {15000.0,15000.0,15000.0};
		long[]   items5 = {13458,7945,1455};
		String[] items6 = {"India","Russia","Japan"};
		
		Tourism Treck = new Tourism("Mount Elbrus",'S',"Russia",1,true,items1,items2,items3,items4,items5,items6);
		
		Treck.display();
		
		
		
		
		
		
		
		
		
	}

}
