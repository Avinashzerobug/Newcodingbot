package com.encapsulation.access.nun;

import com.encapsulation.access.Mobile;
import com.encapsulation.access.MobileRunner;

public class MobileRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mo = new Mobile ();
		MobileRunner mob =new MobileRunner();
		
		System.out.println(mo. getName());
		System.out.println(mo. getSeries());
		System.out.println(mo. getCompany());
		System.out.println(mo. getNoOfVersion());	
		System.out.println(mo. isReadiator());
		System.out.println(mo. getFps());
		System.out.println(mo. getChipSet());
		System.out.println(mo. getGraphicsEngine());
		System.out.println(mo. getSpeed());
		System.out.println(mo. getMemoryInterface());
		System.out.println(mo. getProcessor());
		
		System.out.println(System.lineSeparator());
		
		mob.moby(mo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
