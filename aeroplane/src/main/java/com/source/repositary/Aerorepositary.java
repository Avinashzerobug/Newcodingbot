package com.source.repositary;

import com.source.dto.AeroPlaneDTO;
import com.source.entity.AeroPlaneEntity;

public interface Aerorepositary {

	boolean saving(AeroPlaneEntity aeroPlaneEntity);
	
	default AeroPlaneEntity findBy(int id)
	{
		return null;
		
	}
}
