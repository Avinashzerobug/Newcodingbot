package com.source.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.source.dto.CMDTO;

public interface CmService {

	
	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
	
	
	
	
	
}
