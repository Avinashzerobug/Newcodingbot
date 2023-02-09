package com.source.repositary;

import com.source.dto.RailWayStationDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public class RailWayStationRepositary implements RailWayRepositary {

	RailWayStationDTO[] dtos = new RailWayStationDTO[5];
	int index = 0;
	
	
	@Override
	public boolean saved(RailWayStationDTO dto) throws SizeIsFullExceptionInitiated {
		
		if(this.index>=this.dtos.length)
		{
			throw new SizeIsFullExceptionInitiated("Check the data array size is full");
		}
		
		dtos[index]=dto;
		index++;
		return false;
	}

}
