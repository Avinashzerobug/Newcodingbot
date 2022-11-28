package com.source.connection.runner;

import com.source.connection.Car;

public class Benz  implements Car{

	@Override
	public String name() {
		System.out.println("Mercedez E class");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int price() {
		System.out.println(4500000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String brand() {
		System.out.println("General Motors");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ceo() {
		System.out.println("GM");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String facotryLocation() {
		System.out.println("USA");
		// TODO Auto-generated method stub
		return null;
	}

}
