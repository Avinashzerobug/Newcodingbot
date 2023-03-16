package com.source.vinay.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.source.vinay.Entity.SpaceStationEntity;
import com.source.vinay.dto.SpaceStationDTO;


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

}

