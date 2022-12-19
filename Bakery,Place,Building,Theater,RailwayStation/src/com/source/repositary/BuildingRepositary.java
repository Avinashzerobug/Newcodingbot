package com.source.repositary;

import com.source.dto.BuildingDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface BuildingRepositary {

	
	boolean saving(BuildingDTO dto) throws SizeIsFullExceptionInitiated;
	
}
