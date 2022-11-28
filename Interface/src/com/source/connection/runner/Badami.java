package com.source.connection.runner;

import com.source.connection.Tourism;

public class Badami implements Tourism {

	@Override
	public String place() {
		System.out.println("Badami");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ticket() {
		System.out.println("Ticket:"+55);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String name() {
		System.out.println("Bagalkot");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfTourist() {
		System.out.println("No of Tourist per day:"+5000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String location() {
		System.out.println("North Karnataka Bagalkot");
		// TODO Auto-generated method stub
		return null;
	}

}
