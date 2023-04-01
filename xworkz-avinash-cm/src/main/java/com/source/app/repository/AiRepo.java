package com.source.app.repository;

import java.util.Collections;
import java.util.List;

import com.source.app.entity.AiEntity;

public interface AiRepo {

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
}
