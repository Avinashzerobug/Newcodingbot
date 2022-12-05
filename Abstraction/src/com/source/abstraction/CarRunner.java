package com.source.abstraction;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car = new Engine();
		TestingCar test = new TestingCar(car);
		
		test.checking();
		
		
		
	}

}
