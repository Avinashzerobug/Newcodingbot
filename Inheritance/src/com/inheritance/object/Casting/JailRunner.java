package com.inheritance.object.Casting;

import com.inheritance.object.Jail;
import com.inheritance.object.boot.Cookers;
import com.inheritance.object.boot.Killer;
import com.inheritance.object.boot.Police;

public class JailRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jail jail = new Jail();
		Jail jail1 = new Killer();
		
		Killer kill = (Killer)jail1;
		System.out.println(kill.jailName);
		System.out.println(kill.name);
		System.out.println(kill.killerName);
		System.out.println(kill.jailName);
		
		
		System.out.println(System.lineSeparator());
		
		
		Jail jail2 = new Police();
		Police police = (Police)jail2;
		System.out.println(police.location);
		System.out.println(police.name);
		System.out.println(police.policeName);
		System.out.println(police.noOfPolice);
		
		
		System.out.println(System.lineSeparator());
		
		Jail jail3 = new Cookers();
		Cookers cook = (Cookers)jail3;
		System.out.println(cook.name);
		System.out.println(cook.location);
		System.out.println(cook.cookName);
		System.out.println(cook.noOfKillers);
		
		
		
		
		
		
	}

}
