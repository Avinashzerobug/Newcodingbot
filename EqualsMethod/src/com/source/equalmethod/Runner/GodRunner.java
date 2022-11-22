package com.source.equalmethod.Runner;

import com.source.equalmethod.God;

public class GodRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		God god = new God("SHIVA",4355677,"Shree Manjunath temple","White",true,"Ganesh",90,"Lord Shiva",565635,false);
		System.out.println(god);
		
		God god2 = new God("SHIVA",45455,"Shree Manjunath temple","White",true,"Ganesh",85,"Lord Shiva",3565,false);
		System.out.println(god2);

		
		boolean god1 = god.equals(god2);
		System.out.println(god1);
		
		
		
		
		
		
		
		
		
		
	}

}
