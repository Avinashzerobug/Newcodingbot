package com.source.interfacing;

import com.source.customexception.GmailExceptionInitialze;

public interface GmailFace {

	
	boolean making(String gmail) throws GmailExceptionInitialze;
	
	default int totalGmails()
	{
		return 0;
		
	}
	
	
	
	
}
