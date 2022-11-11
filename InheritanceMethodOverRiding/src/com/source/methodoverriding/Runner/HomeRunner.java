package com.source.methodoverriding.Runner;

import com.source.methodoverriding.Home;
import com.source.methodoverriding.child.PG;

public class HomeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Home home = new Home();
		home.SweetHome();
		
		System.out.println(System.lineSeparator());
		
		PG pg = new PG();
		pg.SweetHome();
		pg.HomeSweet();
		
		
		
		
		
	}

}
