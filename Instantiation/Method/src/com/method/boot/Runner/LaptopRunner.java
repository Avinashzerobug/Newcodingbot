package com.method.boot.Runner;

import com.method.boot.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] items1 = {"Lenevo","Dell","Mac Book","Asus"};
		String[] items2 = {"Windows","Lenux","MacOS"};
		String[] items3 = {"local disk c ","local disk d","local disk e","local disk f"};
		double[] items4 = {50000.0,150000.0,2000000.0};
		long[]   items5 = {13458,794543,1455354};
		String[] items6 = {"India","Russia","Japan"};
		
		Laptop OS = new Laptop("JAVA","Code","USA",1,true,items1,items2,items3,items4,items5,items6);
		
		OS.display();
		
		
		
		
		
		
		
		
		
		
	}

}
