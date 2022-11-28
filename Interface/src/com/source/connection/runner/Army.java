package com.source.connection.runner;

import com.source.connection.Military;

public class Army implements Military {

	@Override
	public String country() {
		System.out.println("INDIA");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfWars() {
		System.out.println("No of wars:"+4);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String soldierName() {
		System.out.println("Bhagat Singh");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String enemyCountry() {
		System.out.println("Pakistan");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int typesOfMilitary() {
		System.out.println("types of military:"+3);
		// TODO Auto-generated method stub
		return 0;
	}

}
