package com.source.connection.runner;

import com.source.connection.Mobile;

public class MI implements Mobile {

	@Override
	public String name() {
		System.out.println("Red mi note 9 pro max");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int price() {
		System.out.println("price:"+19000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String brand() {
		System.out.println("MI");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int batteryCapacity() {
		System.out.println(5000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String logo() {
		System.out.println("XIOMI");
		// TODO Auto-generated method stub
		return null;
	}

}
