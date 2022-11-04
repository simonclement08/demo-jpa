package fr.diginamic.bibliotheque;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

	/** Id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	/** Date de début */
	@Column(name = "DATE_DEBUT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebut;

	/** Délai */
	@Column(name = "DELAI", nullable = true)
	private Integer delai;

	/** Date de fin */
	@Column(name = "DATE_FIN", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;

	/** Client */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	/** Liste des compos */
	@OneToMany(mappedBy = "emprunt")
	private List<Compo> compos = new ArrayList<Compo>();

	/** Constructeur */
	public Emprunt() {
		super();
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", delai=" + delai + ", dateFin=" + dateFin
				+ ", client=" + client + "]";
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
	 * Getter pour l'attribut dateDebut
	 * 
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter pour l'attribut dateDebut
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter pour l'attribut delai
	 * 
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/**
	 * Setter pour l'attribut delai
	 * 
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	/**
	 * Getter pour l'attribut dateFin
	 * 
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter pour l'attribut dateFin
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter pour l'attribut client
	 * 
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Setter pour l'attribut client
	 * 
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter pour l'attribut compos
	 * 
	 * @return the compos
	 */
	public List<Compo> getCompos() {
		return compos;
	}

}
