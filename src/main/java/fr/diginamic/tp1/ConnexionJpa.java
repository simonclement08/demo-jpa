package fr.diginamic.tp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Region region = em.find(Region.class, 2);
		System.out.println(region.getNom());

		Region newRegion = new Region();
		newRegion.setNom("Bretagne");

		em.persist(newRegion);

		Integer id = newRegion.getId();

		region = em.find(Region.class, id);
		System.out.println(region.getNom());

		transaction.commit();
	}

}
