package com.source.abstraction;

public class Engine implements Car {

	@Override
	public String engineName() {
		// TODO Auto-generated method stub
		return "V8";
	}

	@Override
	public boolean engineWorking() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int horsePower() {
		// TODO Auto-generated method stub
		return 0;
	}

}
