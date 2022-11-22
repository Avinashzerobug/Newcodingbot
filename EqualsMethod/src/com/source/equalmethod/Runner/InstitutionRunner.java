package com.source.equalmethod.Runner;

import com.source.equalmethod.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Institution insti = new Institution("Royal India",445656,"Avinash Mullur","Kumar",5555,"Bagalkot",0,"RBI","Avinash","Laxmikant");
		System.out.println(insti);
		

		Institution insti1 = new Institution("Royal India",445656,"Avinash Mullur","Kumar",5555,"Bagalkot",0,"RBI","Avinash","Laxmikant");
		System.out.println(insti1);
		
		
		boolean insti2 = insti.equals(insti1);
		System.out.println(insti2);
		
		
		
		
		
		
	}

}
