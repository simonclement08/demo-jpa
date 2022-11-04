package fr.diginamic.bibliotheque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMPO")
public class Compo {

	/** Id */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** Emprunt */
	@ManyToOne
	@JoinColumn(name = "ID_EMP")
	private Emprunt emprunt;

	/** Livre */
	@ManyToOne
	@JoinColumn(name = "ID_LIV")
	private Livre livre;

	/** Constructeur */
	public Compo() {
		super();
	}

	@Override
	public String toString() {
		return "Compo [id=" + id + ", livre=" + livre + "]";
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
	 * Getter pour l'attribut emprunt
	 * 
	 * @return the emprunt
	 */
	public Emprunt getEmprunt() {
		return emprunt;
	}

	/**
	 * Setter pour l'attribut emprunt
	 * 
	 * @param emprunt the emprunt to set
	 */
	public void setEmprunt(Emprunt emprunt) {
		this.emprunt = emprunt;
	}

	/**
	 * Getter pour l'attribut livre
	 * 
	 * @return the livre
	 */
	public Livre getLivre() {
		return livre;
	}

	/**
	 * Setter pour l'attribut livre
	 * 
	 * @param livre the livre to set
	 */
	public void setLivre(Livre livre) {
		this.livre = livre;
	}

}
