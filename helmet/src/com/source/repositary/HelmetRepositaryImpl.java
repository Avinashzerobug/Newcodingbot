package com.source.repositary;

import com.source.dto.HelmetDTO;
import com.source.exception.SizeOfTheArrayIsFull;

public class HelmetRepositaryImpl implements HelmetRepositary {

	HelmetDTO[] helmet = new HelmetDTO[10];
	int index = 0;
	
	
	@Override
	public boolean saved(HelmetDTO dto) {
		if(this.index>=this.helmet.length)
		{
			System.out.println("Exception is started");
			throw new SizeOfTheArrayIsFull();
		}
		
		this.helmet[index]=dto;
		System.out.println("Saved:"+dto+"index"+this.index);
		index++;
		return false;
	}

}
