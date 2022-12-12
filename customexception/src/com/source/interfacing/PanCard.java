package com.source.interfacing;

import com.source.customexception.PancardExceptionInitialize;

public interface PanCard {

	
	boolean maker(String pan) throws PancardExceptionInitialize;
	
	default int totalPanCard()
	{
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
}
