package com.source.connection.runner;

import com.source.connection.RTO;

public class People implements RTO {

	@Override
	public String redlight() {
		System.out.println("Red Light: it indicates that vehiclee should stop");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isItGreenLight() {
		System.out.println(false);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int noOflight() {
		System.out.println(3);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int trafficTiming() {
		System.out.println(60);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String areaName() {
		System.out.println("area name Rajajinagar");
		// TODO Auto-generated method stub
		return null;
	}

}
