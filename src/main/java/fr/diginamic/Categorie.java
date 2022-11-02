package fr.diginamic;

public enum Categorie {
	PETITE("Petite"), MOYENNE("Moyenne"), GRANDE("Grande");

	private String type;

	/** Constructeur
	 * @param type
	 */
	private Categorie(String type) {
		this.type = type;
	}

	/** Getter pour l'attribut type
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/** Setter pour l'attribut type
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
}
