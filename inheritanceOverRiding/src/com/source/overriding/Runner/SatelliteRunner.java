package com.source.overriding.Runner;

import com.source.overriding.Satellite;
import com.source.overriding.child.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Satellite satellite = new Moon(384400.0,true,1969);
		satellite.see();
		
		
		
		
		
	}

}
