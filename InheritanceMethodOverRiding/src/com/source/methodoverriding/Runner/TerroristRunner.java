package com.source.methodoverriding.Runner;

import com.source.methodoverriding.Terrorist;
import com.source.methodoverriding.child.Kasab;

public class TerroristRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Terrorist terror = new Terrorist();
		terror.Terror();
		
		System.out.println(System.lineSeparator());
		
		Kasab kasab = new Kasab();
		kasab.Terror();
		kasab.Peace();
		
		
		
		
		
		
	}

}
