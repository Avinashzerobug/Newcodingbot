package com.source.repositary;

import com.source.dto.TheaterDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface TheaterRepositary {

	
	boolean saving(TheaterDTO dto) throws SizeIsFullExceptionInitiated;
	
}
