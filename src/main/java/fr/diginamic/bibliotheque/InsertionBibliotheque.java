package fr.diginamic.bibliotheque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Livre livre = em.find(Livre.class, 1);

		System.out.println(livre);

		Emprunt emprunt = em.find(Emprunt.class, 2);
		System.out.println("\nListe des livres lié à l'emprunt n°2 : ");
		for (Compo compo : emprunt.getCompos()) {
			System.out.println(compo.getLivre());
		}

		Client client = em.find(Client.class, 3);
		System.out.println("\nListe des emprunts lié au client n°3 : ");
		for (Emprunt empr : client.getEmprunts()) {
			System.out.println(empr);
		}

		transaction.commit();

	}

}
