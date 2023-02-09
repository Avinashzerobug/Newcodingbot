package com.source.repositary;

import com.source.dto.BakeryDTO;
import com.source.exception.SizeIsFullExceptionInitiated;

public class BakeryRepositaryImpl implements BakeryRepositary {

	private BakeryDTO[] dtos = new BakeryDTO[5];
	private int index = 0;
	
	@Override
	public boolean saving(BakeryDTO dto) throws SizeIsFullExceptionInitiated {
		System.out.println("Checking the repositary condition");
		if(this.index>=this.dtos.length)
		{
			System.err.println("Exception is intitiated");
			throw new SizeIsFullExceptionInitiated("Check the array size you trying to add additonal data");
		}
		
		dtos[index]=dto;
		index++;
		return false;
	}

}
