package com.source.service;

import com.source.dto.BuildingDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface BuildingService {

	
	boolean validateAndSaved(BuildingDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated;
	
}
