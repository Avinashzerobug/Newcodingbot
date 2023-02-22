package com.source.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.source.dto.AeroPlaneDTO;

public interface AeroPlaneService {

	Set<ConstraintViolation<AeroPlaneDTO>> validateAndSave(AeroPlaneDTO aeroPlaneDTO);
	
	default AeroPlaneDTO findById(int id)
	{
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
