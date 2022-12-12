package com.source.handling;

import com.source.customexception.PancardExceptionInitialize;
import com.source.interfacing.PanCard;

public class PanCardName implements PanCard {

	
	private String[] name = new String[10];
	private int index =  0;
	
	
	public boolean maker(String name) throws PancardExceptionInitialize
	{
		if(this.index>=this.name.length)
		{
			throw new PancardExceptionInitialize();
		}
		this.name[index] = name;
		index++;
		
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
