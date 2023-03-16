package com.space.app.repositary;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.space.app.Entity.SpaceStationEntity;
import com.space.app.dto.SpaceStationDTO;


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


	@Override
	public List<SpaceStationEntity> allData() {

		System.out.println("Running the all data ");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
		Query query = manager.createNamedQuery("allData");
		
		System.out.println("query"+query);
		
		List<SpaceStationEntity> list = query.getResultList();
		System.out.println("Total list "+list.size());
		return list;
		}
		finally
		{
			manager.close();
			System.out.println("removing connection success");
		}
	}
	
   @Override
public List<SpaceStationEntity> findByName(String name) {
	   System.out.println("Running findByName in repository " + name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nam", name);
			System.out.println("query : " + query);
			List<SpaceStationEntity> list = query.getResultList();
			System.out.println("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("Released the connection");
		}
}
   
   @Override
public List<SpaceStationEntity> findByNameAndCountry(String name, String countries) {
	   System.out.println("Running findByNameAndCountry in repository " + name + countries);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndCountry");
			query.setParameter("nam", name);
			query.setParameter("count", countries);
			System.out.println("query : " + query);
			List<SpaceStationEntity> list = query.getResultList();
			System.out.println("Total list found in repo " + list.size());
			return list;
		} finally {
			manager.close();
			System.out.println("Released the connection");
		}
}
   
   
	
}


