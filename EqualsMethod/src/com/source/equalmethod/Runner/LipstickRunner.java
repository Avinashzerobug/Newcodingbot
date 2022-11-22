package com.source.equalmethod.Runner;

import com.source.equalmethod.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Lipstick lips = new Lipstick("lipstick",444,"Lakme","red",false,"Hindustan Unilever","Low Price","Mumbai","Red Bull","GST");
		System.out.println(lips);
		
		
		
		Lipstick lips1 = new Lipstick("lipstick",444,"Lakme","red",true,"Hindustan Unilever","Low Price","Mumbai","Red Bull","GST");
		System.out.println(lips1);
		
		
		boolean lips2 = lips.equals(lips1);
		System.out.println(lips2);
		
		
		
		
		
	}

}
