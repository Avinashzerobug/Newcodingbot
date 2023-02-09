package com.source.service;

import com.source.dto.TheaterDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface TheaterService {

	boolean validateAndSaved(TheaterDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated;
	
	
}
