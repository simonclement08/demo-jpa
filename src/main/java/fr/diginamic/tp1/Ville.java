package fr.diginamic.tp1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "VILLE")
public class Ville {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** Nom */
	@Column(name = "NOM", length = 50, nullable = false)
	private String nom;

	/** Code postal */
	@Column(name = "CODE_POSTAL", length = 10, nullable = false)
	private String codePostal;

	/** Date du dernier recensement */
	@Column(name = "DATE_DERNIER_RECENSEMENT", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDernierRecensement;

	/** Catégorie */
	@Column(name = "CATEGORIE", length = 20, nullable = false)
	@Enumerated(EnumType.STRING)
	private Categorie categorie;

	/** Région */
	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	private Region region;

	/** Liste des habitants */
	@ManyToMany
	@JoinTable(name = "VILLE_HABITANT", 
		uniqueConstraints = {@UniqueConstraint(columnNames = { "ID_VILLE", "ID_HABITANT" })},
		joinColumns = {@JoinColumn(name = "ID_VILLE", referencedColumnName = "ID")}, 
		inverseJoinColumns = {@JoinColumn(name = "ID_HABITANT", referencedColumnName = "ID")})
	private List<Habitant> habitants = new ArrayList<Habitant>();

	/** Constructeur */
	public Ville() {
		super();
	}

	/**
	 * Getter pour l'attribut id
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	 * Getter pour l'attribut codePostal
	 * 
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter pour l'attribut codePostal
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter pour l'attribut dateDernierRecensement
	 * 
	 * @return the dateDernierRecensement
	 */
	public Date getDateDernierRecensement() {
		return dateDernierRecensement;
	}

	/**
	 * Setter pour l'attribut dateDernierRecensement
	 * 
	 * @param dateDernierRecensement the dateDernierRecensement to set
	 */
	public void setDateDernierRecensement(Date dateDernierRecensement) {
		this.dateDernierRecensement = dateDernierRecensement;
	}

	/**
	 * Getter pour l'attribut categorie
	 * 
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * Setter pour l'attribut categorie
	 * 
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter pour l'attribut region
	 * 
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * Setter pour l'attribut region
	 * 
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/** Getter pour l'attribut habitants
	 * @return the habitants
	 */
	public List<Habitant> getHabitants() {
		return habitants;
	}
	
}
