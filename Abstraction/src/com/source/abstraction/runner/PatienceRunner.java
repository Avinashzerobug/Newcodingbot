package com.source.abstraction.runner;

import com.source.abstraction.Patient;
import com.source.abstraction.overriding.Hospital;
import com.source.abstraction.ruler.HospitalManagement;

public class PatienceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient patience = new Hospital();
		HospitalManagement manage = new HospitalManagement(patience);
		
		manage.visiting();
		
		
		
		
	}

}
