package com.source.methodoverriding.Runner;

import com.source.methodoverriding.WarJet;
import com.source.methodoverriding.child.Rafel;

public class WarJetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WarJet warJet = new WarJet();
		warJet.Jet();
		warJet.War();
		
		System.out.println(System.lineSeparator());
		
		Rafel rafel = new Rafel();
		{
			rafel.Jet();
	   }
		
		
		
	}

}
