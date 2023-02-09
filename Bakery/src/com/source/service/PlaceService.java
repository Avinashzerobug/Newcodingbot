package com.source.service;

import com.source.dto.PlaceDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface PlaceService {

	 boolean validateAndSaved(PlaceDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated;
	 
	 
	
	
}
