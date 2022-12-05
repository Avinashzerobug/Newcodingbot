package com.source.abstraction.runner;

import com.source.abstraction.Passengers;
import com.source.abstraction.overriding.Metro;
import com.source.abstraction.ruler.BMRCL;

public class PassengersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Passengers passenger = new Metro();
		
		BMRCL bmrcl = new BMRCL(passenger);
		
		bmrcl.seeing();
		
	}

}
