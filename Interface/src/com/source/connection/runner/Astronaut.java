package com.source.connection.runner;

import com.source.connection.SpaceStation;

public class Astronaut implements SpaceStation {

	@Override
	public String docking() {
		System.out.println("Lets go to the Mars");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfCountries() {
		System.out.println(7);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int noOfSpaceStation() {
		System.out.println("No of space station:"+1);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String name() {
		System.out.println("International Space Station");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isItSafe() {
		System.out.println("Yes its safe to live there");
		// TODO Auto-generated method stub
		return false;
	}

}
