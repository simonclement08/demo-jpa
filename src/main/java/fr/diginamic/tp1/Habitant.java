package fr.diginamic.tp1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "HABITANTS")
public class Habitant {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	/** Nom */
	@Column(name = "NOM", length = 20, nullable = false)
	private String nom;

	/** Prénom */
	@Column(name = "PRENOM", length = 20, nullable = false)
	private String prenom;

	/** Liste des villes */
	@ManyToMany
	@JoinTable(name = "VILLE_HABITANT", 
		uniqueConstraints = {@UniqueConstraint(columnNames = { "ID_VILLE", "ID_HABITANT" })}, 
		joinColumns = {@JoinColumn(name = "ID_HABITANT", referencedColumnName = "ID")}, 
		inverseJoinColumns = {@JoinColumn(name = "ID_VILLE", referencedColumnName = "ID")})
	private List<Ville> villes = new ArrayList<Ville>();

	/** Constructeur */
	public Habitant() {
		super();
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

	/**
	 * Getter pour l'attribut prenom
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter pour l'attribut prenom
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter pour l'attribut villes
	 * 
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

}
