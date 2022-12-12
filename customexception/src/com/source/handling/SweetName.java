package com.source.handling;

import com.source.customexception.SweetNameExceptionInitialize;
import com.source.interfacing.Sweet;

public class SweetName implements Sweet {
	
	
	private String[] name = new String[10];
	private int index=0;

	@Override
	public boolean creating(String sweetie) throws SweetNameExceptionInitialize {
	
		if(index>=name.length)
		{
			throw new SweetNameExceptionInitialize();
		}
		this.name[index] = sweetie;
		index++;
		
		return false;
	}
	
	    
	

}
