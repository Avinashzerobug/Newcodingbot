package com.source.methodoverriding.child;

import com.source.methodoverriding.PetrolBunk;

public class Relance extends PetrolBunk{

	
	@Override
	public void RelanceDigital()
	{
		System.out.println("Relance is the Petrol Bunk");
		super.RelanceDigital();
		
	}
	
	
	
	
}
