package fr.diginamic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REGION")
public class Region {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** Nom */
	@Column(name = "NOM", length = 30, nullable = false)
	private String nom;
	
	/** Liste des villes de la région */
	@OneToMany(mappedBy = "region")
	private List<Ville> villes;

	/** Constructeur */
	public Region() {
	}

	/**
	 * Getter pour l'attribut id
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut villes
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/** Setter pour l'attribut villes
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

}
