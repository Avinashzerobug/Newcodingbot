package com.source.equalmethod.Runner;

import com.source.equalmethod.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Paint paint = new Paint("Asian Paint",5000,"Asian Paint","Black",true,"Champaklal Choksey",1997,"Mumbai",79845,true);
		
		System.out.println(paint);
		
		System.out.println(System.lineSeparator());
		
		
		Paint paint2 = new Paint("Asian Paint",5600,"Nippon","Red",true,"Laxman Raj",2002,"Gurugam",885667,true);
		System.out.println(paint2);
		
		
		//paint = paint2;
		
		boolean pain = paint.equals(paint2);
		System.out.println(pain);
		
		paint = paint2;
		System.out.println(paint==paint2);
		
		
	}

}
