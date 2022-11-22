package com.source.equalmethod.Runner;

import com.source.equalmethod.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hospital hospital = new Hospital("All India Institution Of Medical Science",5435,"Balachandra Babaji","Balachandra Babaji",3455,"Delhi",150000,"Social Fund","Avinash","Avinash Kumar Mullur");
		System.out.println(hospital);
		
		
		Hospital hospital1 = new Hospital("All India Institution Of Medical Science",5435,"Balachandra Babaji","Balachandra Babaji",3455,"Delhi",150000,"Social Fund","Avinash","Avinash Kumar Mullur");
		System.out.println(hospital1);
		
		
		boolean patient =hospital.equals(hospital1);
		System.out.println(patient);
		
		
		
	}

}
