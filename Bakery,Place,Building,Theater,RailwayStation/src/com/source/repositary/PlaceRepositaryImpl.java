package com.source.repositary;

import com.source.dto.PlaceDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public class PlaceRepositaryImpl implements PlaceRepositary {

	PlaceDTO[] dtos = new PlaceDTO[10];
	int index = 0;
	
	
	
	@Override
	public boolean saved(PlaceDTO dto) throws SizeIsFullExceptionInitiated {
		
		if(this.index>=this.dtos.length)
		{
			throw new  SizeIsFullExceptionInitiated("Data is full check the array size");
		}
		
		dtos[index] = dto;
		index++;
		
		
		return false;
	}

}
