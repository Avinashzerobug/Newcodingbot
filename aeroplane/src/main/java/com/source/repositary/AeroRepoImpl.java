package com.source.repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.source.dto.AeroPlaneDTO;
import com.source.entity.AeroPlaneEntity;

@Repository
public class AeroRepoImpl implements Aerorepositary {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	

	public AeroRepoImpl() 
	{
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the Aero Repositary");
	}
	


	@Override
	public boolean saving(AeroPlaneEntity aeroPlaneEntity) {
		// TODO Auto-generated method stub
		EntityManager entity = this.entityManagerFactory.createEntityManager();
		EntityTransaction tr = entity.getTransaction();
		tr.begin();
		entity.persist(aeroPlaneEntity);
		tr.commit();
		entity.close();
		
		return true;
	}

	
	@Override
	public AeroPlaneEntity findBy(int id) {
		// TODO Auto-generated method stub
		System.out.println("Running the Find by id:"+id);
		EntityManager entity = this.entityManagerFactory.createEntityManager();
		AeroPlaneEntity entity1 = entity.find(AeroPlaneEntity.class, id);
		entity.close();
		return entity1;
	}
	

}
