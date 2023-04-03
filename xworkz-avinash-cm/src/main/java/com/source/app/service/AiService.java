package com.source.app.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.source.app.dto.AiWorld;
import com.source.app.entity.AiEntity;

public interface AiService {

	
	Set<ConstraintViolation<AiWorld>> validateAndSave(AiWorld aiWorld);
	
	

	default List<AiWorld> findAll() {
		return Collections.emptyList();
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long num) {
		return null;
	}

	default Long findByUser(String userId) {
		return null;
	}

	boolean sendMail(String email);
	
   default List<AiWorld> findByUserId(String userId,String password)
   {
	   return null;
   }
}
