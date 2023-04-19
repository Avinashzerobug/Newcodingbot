package com.source.app.service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.mail.internet.AddressException;
import javax.validation.ConstraintViolation;

import org.springframework.web.multipart.MultipartFile;

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

	
	
   default AiWorld findByUserId(String userId,String password)
   {
	   return null;
   }
   
   default AiWorld findByEmailId(String email) {
	   return null;
   }
  
  
   default AiWorld changePassword(String userId,String password,String confirmPassword)
   {
	   return null;
	   
   }
   
   public void savePhoto(MultipartFile file, int signUpId) throws IOException ;
   
   /*default AiWorld findByUserIdies(String userId,Integer loginCount,String password)
   {
	   return null;
   }*/
}
