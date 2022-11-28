package com.source.connection.runner;

import com.source.connection.PoliceStation;

public class  Killer implements PoliceStation {

	

	@Override
	public boolean arrest() {
		System.out.println("Arrest the killer");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String name() {
		System.out.println("name of the killer");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfBullets() {
		System.out.println("No of bullets he fired");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String arrested() {
		System.out.println("Still he's not arrested");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char jailWarden() {
		System.out.println("jail warden name is Huli");
		// TODO Auto-generated method stub
		return 0;
	}

}
