package com.source.vinay.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.source.vinay.Entity.SpaceStationEntity;


@Repository
public class SpaceStationRepoImpl implements SpaceStationRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public SpaceStationRepoImpl() {
		System.out.println("Creating the space service impl");
	}

	@Override
	public boolean saved(SpaceStationEntity spaceStationEntity) {
		EntityManager entity = this.entityManagerFactory.createEntityManager();
		EntityTransaction tr = entity.getTransaction();
		tr.begin();
		entity.persist(spaceStationEntity);
		tr.commit();
		entity.close();

		return true;
	}

	@Override
	public SpaceStationEntity findBy(int id) {
		// TODO Auto-generated method stub
		System.out.println("Running the Find by id:" + id);
		EntityManager entity = this.entityManagerFactory.createEntityManager();
		SpaceStationEntity entity1 = entity.find(SpaceStationEntity.class, id);
		entity.close();
		return entity1;
	}

	

	@Override
	public List<SpaceStationEntity> findByCountries(String countries) {
		// TODO Auto-generated method stub
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try
		{
			Query query = manager.createNamedQuery("findByCountries");
			query.setParameter("count", countries);
			List<SpaceStationEntity> list = query.getResultList();
			System.out.println("Total list found in repositary:"+ list.size());
			return list;
		}
		finally
		{
		    manager.close();
		}
		
	}
	
	
	@Override
	public boolean update(SpaceStationEntity entity)
	{
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try
		{
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		return true;
		}
		finally
		{
			manager.close();
		}
	}

	@Override
	public boolean deleteSpace(int id) {
		// TODO Auto-generated method stub
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		SpaceStationEntity entity = manager.find(SpaceStationEntity.class, id);
		
		transaction.begin();
		manager.remove(entity);
		transaction.commit();
		manager.close();
		
		return true;
		
	}
	
   
}


