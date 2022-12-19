package com.source.service;

import com.source.dto.RailWayStationDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface RailWayService {

	boolean validateAndSaved(RailWayStationDTO dto) throws SizeIsFullExceptionInitiated, CheckTheDataOnceAgainItsNotMatchingRequriements;
	
}
