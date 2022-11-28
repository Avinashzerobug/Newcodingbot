package com.source.connection.runner;

import com.source.connection.Software;

public class Google implements Software {

	@Override
	public String companyName() {
		System.out.println("Google");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfCompany() {
		System.out.println("No of Company:"+4500);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String ceo() {
		System.out.println("Sundar Pichai");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String netWorth() {
		System.out.println(6566767);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfEmployee() {
		System.out.println(5000);
		// TODO Auto-generated method stub
		return 0;
	}

}
