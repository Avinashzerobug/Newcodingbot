package com.source.connection.runner;

import com.source.connection.Earbuds;

public class Boat implements Earbuds {

	@Override
	public String name() {
		System.out.println("Boat earphones 131");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int price() {
		System.out.println("price:"+1500);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String series() {
		System.out.println("series:"+131);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfEarBuds() {
		System.out.println(2);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String brand() {
		System.out.println("BOAt");
		// TODO Auto-generated method stub
		return null;
	}

}
