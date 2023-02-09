package com.source.repositary;

import com.source.dto.PlaceDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface PlaceRepositary {

	
	boolean saved(PlaceDTO dto) throws SizeIsFullExceptionInitiated;
}
