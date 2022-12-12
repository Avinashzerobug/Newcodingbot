package com.source.interfacing;

import com.source.customexception.SweetNameExceptionInitialize;

public interface Sweet {

	
	 boolean creating(String sweeie) throws SweetNameExceptionInitialize;
	
	default int totalNames()
	{
		return 0;
		
	}
	
	
	
}
