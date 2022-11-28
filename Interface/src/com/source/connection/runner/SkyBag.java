package com.source.connection.runner;

import com.source.connection.Bags;

public class SkyBag implements Bags {

	@Override
	public String name() {
		System.out.println("Sky Bag");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfBags() {
		System.out.println(50000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String brand() {
		System.out.println("Sky Bag");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int price() {
		
		System.out.println(4500);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String logo() {
		System.out.println("SKY BAG");
		// TODO Auto-generated method stub
		return null;
	}

}
