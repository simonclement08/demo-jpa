package fr.diginamic;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Ville ville1 = new Ville();
		ville1.setNom("Charleville-Mézières");
		ville1.setCodePostal("08000");
		ville1.setDateDernierRecensement(new Date());
		ville1.setCategorie(Categorie.MOYENNE);
		em.persist(ville1);

		Ville ville2 = new Ville();
		ville2.setNom("Reims");
		ville2.setCodePostal("51100");
		ville2.setCategorie(Categorie.GRANDE);
		em.persist(ville2);

		transaction.commit();

	}

}
