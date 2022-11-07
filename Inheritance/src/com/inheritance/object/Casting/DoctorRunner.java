package com.inheritance.object.Casting;

import com.inheritance.object.Doctor;
import com.inheritance.object.boot.Cardiologist;
import com.inheritance.object.boot.Dentist;
import com.inheritance.object.boot.ENT;

public class DoctorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Doctor doc1 = new Doctor();
		System.out.println(doc1.location);
		System.out.println(doc1.name);
		
		Doctor doc = new Dentist();
		Dentist dent = (Dentist)doc;
		System.out.println(dent.hospital);
		System.out.println(dent.location);
		System.out.println(dent.name);
		System.out.println(dent.price);
		
		System.out.println(System.lineSeparator());
		
		Doctor doc2 = new ENT();
		ENT en =(ENT)doc2;
		System.out.println(en.location);
		System.out.println(en.name);
		System.out.println(en.doctorQualification);
		System.out.println(en.noOfDoctors);
		
		System.out.println(System.lineSeparator());
		
		Doctor doc3 = new Cardiologist();
		Cardiologist car = (Cardiologist)doc3;
		System.out.println(car.name);
		System.out.println(car.location);
		System.out.println(car.qualified);
		System.out.println(car.isHeDoctor);
		
		
	}

}
