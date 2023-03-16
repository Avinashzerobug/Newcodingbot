package com.space.app.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.space.app.Entity.SpaceStationEntity;
import com.space.app.dto.SpaceStationDTO;


public interface SpaceStationService {

	Set<ConstraintViolation<SpaceStationDTO>> validateAndSave(SpaceStationDTO dto);

	default SpaceStationDTO findById(int id) {
		return null;

	}
	
	
	default List<SpaceStationDTO> findByCountries(String countries)
	{
		return Collections.emptyList();
		
	}
	

	Set<ConstraintViolation<SpaceStationDTO>> validateAndUpdate(SpaceStationDTO dto);

	boolean deleteSpace(int id);

	default List<SpaceStationDTO> allData()
	{
		return Collections.emptyList();
	}
	
	default List<SpaceStationDTO> findByName(String name) {
		return Collections.emptyList();
	}

	default List<SpaceStationDTO> findByNameAndCountry(String name,String country) {
		return Collections.emptyList();
	}
	
	
	
}

