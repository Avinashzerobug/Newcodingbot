package com.source.repositary;

import com.source.dto.BuildingDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public class BuildingRepositaryImpl implements BuildingRepositary {

	BuildingDTO[] dtos = new BuildingDTO[10];
	int index = 0;
	
	
	
	@Override
	public boolean saving(BuildingDTO dto) throws SizeIsFullExceptionInitiated {
	  
		if(this.index>=this.dtos.length)
		{
			throw new SizeIsFullExceptionInitiated("Check the data is full and array is full");
			
		}
		
		dtos[index]=dto;
		index++;
		
		
		return false;
	}

}
