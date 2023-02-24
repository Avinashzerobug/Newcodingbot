package com.source.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.source.entity.ForestEntity;

public class ForestRunner8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.source");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findCount");
		Object obj = query.getSingleResult();
		long entity = (long)obj;
		System.out.println(entity);
		manager.close();
		

	}

}
