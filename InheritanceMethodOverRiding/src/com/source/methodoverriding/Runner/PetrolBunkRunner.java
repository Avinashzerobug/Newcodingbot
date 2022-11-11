package com.source.methodoverriding.Runner;

import com.source.methodoverriding.PetrolBunk;
import com.source.methodoverriding.child.Relance;

public class PetrolBunkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PetrolBunk petrolBunk = new PetrolBunk();
		petrolBunk.RelanceDigital();
		
		System.out.println(System.lineSeparator());
		
		Relance relance = new Relance();
		relance.RelanceDigital();
		relance.Relance();
		
	}

}
