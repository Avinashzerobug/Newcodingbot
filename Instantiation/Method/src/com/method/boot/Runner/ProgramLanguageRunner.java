package com.method.boot.Runner;

import com.method.boot.ProgramLanguage;

public class ProgramLanguageRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items1 = {"JAVA","JAVA Script","Advance JAVA","C++"};
		String[] items2 = {"Web application","Apps Development","Developing games"};
		String[] items3 = {"Aviansh ","Manoj","Uday","Sandeep"};
		double[] items4 = {500.0,1500.0,2000.0};
		long[]   items5 = {13458,794543,1455354};
		String[] items6 = {"India","Russia","Japan"};
		
		ProgramLanguage code = new ProgramLanguage("JAVA","Code","USA",1,true,items1,items2,items3,items4,items5,items6);
		
		code.display();
		
	}

}
