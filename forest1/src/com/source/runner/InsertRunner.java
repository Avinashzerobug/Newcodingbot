package com.source.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.source.entity.ForestEntity;

public class InsertRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("running main method for inserting dat to data base");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.source");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ForestEntity entity = new ForestEntity(1, "Bandipur National Park", "Karnataka", 874, " dry deciduous forests");
		
		ForestEntity entity1 = new ForestEntity(2, "Bhitarkanika Mangroves", "Odisha", 0, "mangrove wetland");
				ForestEntity entity2 = new ForestEntity(3, "Bhagwan Mahaveer Sanctuary and Mollem National Park", "goa", 650,
						"West Coast tropical evergreen forests");
				ForestEntity entity3 = new ForestEntity(4, "Jakanari reserve forest", "combatore", 520, " reserve forest ");
				ForestEntity entity4 = new ForestEntity(5, "jim Corbett National Park", "uttarakhand", 450,
						"Dense moist deciduous forest");
				ForestEntity entity5 = new ForestEntity(6, "KanhaNationalPark", "MadhyaPradesh", 651, "evergreen Sal forests");
				ForestEntity entity6 = new ForestEntity(7, "Keibul Lamjao National Park", "Manipur", 40, "moist semi–evergreen");
				ForestEntity entity7 = new ForestEntity(8, "Kukrail Reserve Forest", "Uttar Pradesh", 208,"plantation forest");
				ForestEntity entity8 = new ForestEntity(9, "Namdapha National Park", "Arunachal Pradesh", 1985,
						"tropical rain forest");
				ForestEntity entity9 = new ForestEntity(10, "Nanmangalam forest", " Tamil Nadu", 24, "scrubland");
				

		transaction.begin();
		manager.persist(entity);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
	
		transaction.commit();
	}

}
