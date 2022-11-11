package com.source.methodoverriding.Runner;

import com.source.methodoverriding.HR;
import com.source.methodoverriding.child.Akshara;

public class HRRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Akshara akshara = new Akshara();
		akshara.humanResource();		
		
		System.out.println(System.lineSeparator());
		
		HR hr = new HR();
		hr.humanResource();	
		hr.Resource();
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
