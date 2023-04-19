package com.source.app.repository;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import com.source.app.dto.AiWorld;
import com.source.app.entity.AiEntity;



public interface AiRepo  {

	boolean saved(AiEntity entity);
	
	
	
	
	default List<AiEntity> findAll() {
		return Collections.emptyList();
	}

	default Long findByUser(String userId) {
		return null;
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long num) {
		return null;
	}
	
	default AiEntity findByUserId(String userId) {
		return null;
	}

	
	default boolean saveProfilePicture(int signUpId,byte[] profilePicture) {
		return false;
	}
	
	
	
	default boolean findByLogIn(String userId,int loginCount)
	{
		return false;
	}
	
	default AiEntity findByEmailId(String email)
	{
		return null;
	}
	
	
	
	
	
	default boolean changeByPassword(String userId,String password,String confirmPassword)
	{
		return false;
	}
	
	
 /*	default List<AiEntity> findByUserIdies(String userId) {
		return null;
	}*/
	
	
	boolean saved(int signUpId,byte[] data);
	
}
