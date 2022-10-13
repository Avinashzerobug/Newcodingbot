package com.Instantiation.boot.Runner;
import  com.Instantiation.boot.Bread;
public class BreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bread eat = new Bread('S');
		System.out.println(eat.type);
		
		Bread eat1 = new Bread("Square");
		System.out.println(eat1.shape);
		
		Bread eat2 = new Bread(30);
		System.out.println(eat2.price);
		
		Bread eat3 = new Bread(56.5);
		System.out.println(eat3.quantity);		
		
		Bread eat4 = new Bread("Big Bread",'L');
		System.out.println(eat4.companyName);
		System.out.println(eat4.type);
		
		Bread eat5 = new Bread(50.0,30);
		System.out.println(eat5.quantity);
		System.out.println(eat5.price);
		
		Bread eat6 = new Bread(45,'M');
		System.out.println(eat6.price);
		System.out.println(eat6.type);
		
		Bread eat7 = new Bread("Square",40.0);
		System.out.println(eat7.shape);
		System.out.println(eat7.quantity);
	}
	

}
