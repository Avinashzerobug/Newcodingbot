package com.method.boot.Runner;

import com.method.boot.Subjects;

public class SubjectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items1 = {"Maths","Physics","Computer Science","History"};
		String[] items2 = {"Matrices","Gravity","Programming"};
		String[] items3 = {"Aryabhat","C.V.Raman","Charles Babej","Mourya Empire"};
		double[] items4 = {34000.0,150000.0,2000000.0};
		long[]   items5 = {13458,794543,1455354};
		String[] items6 = {"India","Russia","USA"};
		
		Subjects pass = new Subjects("JAVA","Code","USA",1,true,items1,items2,items3,items4,items5,items6);
		
		pass.display();
		
		
	}

}
