package fr.diginamic.bibliotheque;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class Livre {
	
	/** Id */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** Titre */
	@Column(name = "TITRE", length = 255, nullable = false)
	private String titre;
	
	/** Auteur */
	@Column(name = "AUTEUR", length = 50, nullable = false)
	private String auteur;
	
	/** Liste des compos */
	@OneToMany(mappedBy = "livre")
	private List<Compo> compos = new ArrayList<Compo>();
	
	/** Constructeur */
	public Livre() {
		super();
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}

	/** Getter pour l'attribut id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter pour l'attribut titre
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/** Setter pour l'attribut titre
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Getter pour l'attribut auteur
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter pour l'attribut auteur
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/** Getter pour l'attribut compos
	 * @return the compos
	 */
	public List<Compo> getCompos() {
		return compos;
	}

}
