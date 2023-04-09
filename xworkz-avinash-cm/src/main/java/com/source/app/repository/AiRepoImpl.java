package com.source.app.repository;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.source.app.dto.AiWorld;
import com.source.app.entity.AiEntity;


import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class AiRepoImpl implements AiRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	
	
	public AiRepoImpl() {
		super();
		// TODO Auto-generated constructor stub
		log.info("Creating the AI reositary and saving in repo impl class ");
	}

	@Override
	public boolean saved(AiEntity aiEntity) {
		EntityManager entity = this.entityManagerFactory.createEntityManager();
		EntityTransaction tr = entity.getTransaction();
		tr.begin();
		entity.persist(aiEntity);
		tr.commit();
		entity.close();

		return true;
	}

@Override
public List<AiEntity> findAll() {
	EntityManager em = this.entityManagerFactory.createEntityManager();
	try {
		Query query = em.createNamedQuery("find");
		List<AiEntity> list = query.getResultList();
		log.info("Total list size found in repo" + list.size());
		return list;
	} finally {
		em.close();
	}
}

@Override
public Long findByEmail(String email) {
	EntityManager em = this.entityManagerFactory.createEntityManager();
	try {
		Query query = em.createNamedQuery("emailId");
		query.setParameter("emailBy", email);
		Object object = query.getSingleResult();
		Long value = (Long) object;
		System.out.println(value);
		return value;

	} finally {
		em.close();
	}

}

@Override
public Long findByUser(String userId) {
	EntityManager em = this.entityManagerFactory.createEntityManager();
	try {
		Query query = em.createNamedQuery("userId");
		query.setParameter("userBy", userId);
		Object object = query.getSingleResult();
		Long value = (Long) object;
		System.out.println(value);
		return value;

	} finally {
		em.close();
	}
}

@Override
public Long findByMobile(Long num) {
	EntityManager em = this.entityManagerFactory.createEntityManager();
	try {
		Query query = em.createNamedQuery("mobileId");
		query.setParameter("mobileBy", num);
		Object object = query.getSingleResult();
		Long value = (Long) object;
		System.out.println(value);
		return value;

	} finally {
		em.close();
	}
}

@Override
public AiEntity findByUserId(String userId) {
	log.info("Running findByUserAndPassword in repository ");
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	try {
		Query query = manager.createNamedQuery("findByUserId");
		query.setParameter("user", userId);
		log.info("query : " + query);
		Object obj = query.getSingleResult();
		AiEntity entity = (AiEntity) obj;
		log.info("Count " + entity);
		log.info("Duplicates value size" + entity);
		return entity;
	} finally {
		manager.close();
		log.info("Released the connection");
	}
}


/*
@Override
public List<AiEntity> findByUserIdies(String userId) {
	// TODO Auto-generated method stub
	EntityManager em = this.entityManagerFactory.createEntityManager();
	try {
		
		Query query = em.createNamedQuery("userIdies");
		query.setParameter("userBy", userId);
		
		Object object = query.getSingleResult();
	
	}
	finally
	{
		em.close();
	}
	return AiRepo.super.findByUserIdies(userId);
}*/


@Override
public boolean findByLogIn(String userId, int count) {
	log.info("count " + count);
	EntityManager manager = this.entityManagerFactory.createEntityManager();
	try {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateLoginCount");
		query.setParameter("user", userId);
		query.setParameter("count", count);
		query.executeUpdate();
		transaction.commit();
		return true;
	} finally {
		manager.close();
	}

}



}
	



