package com.source.repository;

import com.source.customexception.ArraySizeIsFullCantAddMore;
import com.source.dto.IplDto;

public interface IplRepositary {

	
	boolean create(IplDto dto) throws ArraySizeIsFullCantAddMore;
	
	default int total()	
	{		
		return 0;
	}

	
	default IplDto tempsetName (String tempName)
	{
		return null;
		
	}
	
	
	
	
}
