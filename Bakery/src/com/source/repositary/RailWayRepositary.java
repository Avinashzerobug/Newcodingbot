package com.source.repositary;

import com.source.dto.RailWayStationDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface RailWayRepositary {

	boolean saved(RailWayStationDTO dto) throws SizeIsFullExceptionInitiated, CheckTheDataOnceAgainItsNotMatchingRequriements;
	
}
