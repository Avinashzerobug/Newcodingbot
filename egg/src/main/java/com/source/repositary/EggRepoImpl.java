package com.source.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.source.dto.EggDTO;
import com.source.service.EggService;

@Repository
public class EggRepoImpl implements EggRepositary {

	
	@Autowired
    private EntityManagerFactory entityManagerFactory;
	
	
	
	public EggRepoImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Running the Egg Repo impl");
	}
	
	

	@Override
	public boolean save(EggDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Running the Egg Repo implments");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
        entityTransaction.commit();
        entityManager.close();
		return true;
	}

}
