package com.source.repository;

import com.source.customexception.ArraySizeIsFullCantAddMore;
import com.source.dto.IplDto;

public class IplRepositaryimpl implements IplRepositary {

	private IplDto[] iplDto = new IplDto[10];
	private int index = 0;
	
	
	@Override
	public boolean create(IplDto dto) throws ArraySizeIsFullCantAddMore {
		System.out.println("Running the  create IplDto"+ dto);
		if(this.index>=this.iplDto.length)
		{
			System.out.println("Running the Custom Exception");
			throw new ArraySizeIsFullCantAddMore();
		}
		
		this.iplDto[this.index]=dto;
		System.out.println("Saved:"+dto+"In index"+this.index);
		index++;
		
		// TODO Auto-generated method stub
		return false;
		
	}

}
