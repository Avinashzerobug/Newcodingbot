package com.source.vinay.repositary;

import java.util.Collections;
import java.util.List;

import com.source.vinay.Entity.SpaceStationEntity;

public interface SpaceStationRepo {

	
	boolean saved(SpaceStationEntity spaceStationEntity);
	
	default SpaceStationEntity findBy(int id)
	{
		return null;
		
	}

	default  List<SpaceStationEntity> findByCountries(String countries)
	{
		return Collections.emptyList();
		
	}
	
	default boolean update(SpaceStationEntity entity)
	{
		return true;
	}
	
	
	
}
