package com.source.interfacing;

public class XworkzRajajinagar implements Xworkz {

	@Override
	public String name() {
		System.out.println("1)Checking the how the multiple inheritance works using interface");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean legal() {
		System.out.println(true+"2)yes its true using interface we can achieve the multiple inheritance"); 
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String principalName() {
		System.out.println("3)Using extend using we can relate multiple interface and in class we can do multiple implements");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double tax() {
		System.out.println("4)Tax is not included in the education");
		// TODO Auto-generated method stub
		return 0;
	}

}
