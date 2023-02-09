package com.source.repositary;

import com.source.dto.TheaterDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public class TheaterRepositaryImpl implements TheaterRepositary{

	TheaterDTO[] dtos = new TheaterDTO[10];
	int index = 0;
	
	
	
	@Override
	public boolean saving(TheaterDTO dto) throws SizeIsFullExceptionInitiated {
		if(this.index>=dtos.length)
		{
			System.err.println("Custom length exception intitiated");
			throw new SizeIsFullExceptionInitiated("Check the size of the array its full cant add more data");
		}
		
		dtos[index]=dto;
		index++;
	
		return false;
	}

}
