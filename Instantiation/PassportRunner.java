package com.Instantiation.boot.Runner;
import   com.Instantiation.boot.Passport;
public class PassportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Passport visa = new Passport(565);
		System.out.println(visa.no);
				
		Passport visa1 = new Passport("Hitler");
		System.out.println(visa1.name);
		
		Passport visa2 = new Passport("Hitler",007);
		System.out.println(visa2.name);
		System.out.println(visa2.no);
				
		Passport visa3 = new Passport(700,"Modi");
		System.out.println(visa3.no);
		System.out.println(visa3.name);
		
		Passport visa4 = new Passport(17,"India","12-10-2000");
		System.out.println(visa4.expiryDate);
		System.out.println(visa4.country);
		System.out.println(visa4.issueDate);
		
		Passport visa5 = new Passport("India",570,18);
		System.out.println(visa5.name);
		System.out.println(visa5.no);
		System.out.println(visa5.expiryDate);
		
		Passport visa6 = new Passport(670,37);
		System.out.println(visa6.no);
		System.out.println(visa6.expiryDate);
		
		Passport visa7 = new Passport("India","Hitler");
		System.out.println(visa7.country); 
	    System.out.println(visa7.name);
		
		
		
		
		
		
		
		
		
		
		
	}

}
