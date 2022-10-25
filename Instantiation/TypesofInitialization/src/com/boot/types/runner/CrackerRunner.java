package com.boot.types.runner;

import com.boot.types.Cracker;
import com.boot.types.Enum.Cracks;


public class CrackerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cracker Fire = new Cracker(Cracks.INDIA);
	    Fire.Diwali(6000);
	    Fire.noOfCrackers = 50000;		
		Fire.show();
        
		
	}

}
