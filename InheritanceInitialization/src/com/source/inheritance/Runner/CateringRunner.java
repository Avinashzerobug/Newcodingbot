package com.source.inheritance.Runner;

import com.source.inheritance.Catering;
import com.source.inheritance.Super.WeddingCatering;

public class CateringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Catering catering = new WeddingCatering("Priya Catering","Wedding Catering",15);
		
		WeddingCatering wed = (WeddingCatering)catering;
		wed.show();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
