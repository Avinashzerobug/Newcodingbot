package com.source.connection.runner;

import com.source.connection.Laptop;

public class Lenevo implements Laptop {

	@Override
	public String name() {
		System.out.println("Lenevo Yoga");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int price() {
		System.out.println("price:"+50000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String brand() {
		System.out.println("brand:"+"Lenevo");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String feature() {
		System.out.println("Flip 360 degree wih intel core 9th gen");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char series() {
		System.out.println("5th series"+'T');
		// TODO Auto-generated method stub
		return 0;
	}

}
