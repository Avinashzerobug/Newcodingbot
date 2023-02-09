package com.source.repositary;

import com.source.dto.BakeryDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public interface BakeryRepositary {

	
	boolean saving(BakeryDTO dto) throws SizeIsFullExceptionInitiated;
}
