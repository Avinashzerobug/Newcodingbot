package com.space.app.repositary;

import java.util.Collections;
import java.util.List;

import com.space.app.Entity.SpaceStationEntity;
import com.space.app.dto.SpaceStationDTO;

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

	boolean deleteSpace(int id);
	
	default List<SpaceStationEntity> allData()
	{
		return Collections.emptyList();
	}
	
	default List<SpaceStationEntity> findByName(String color) {
		return Collections.emptyList();
	}

	default List<SpaceStationEntity> findByNameAndCountry(String name,String color) {
		return Collections.emptyList();
	}
	
	
	
	
	
	
	
	
	
}
