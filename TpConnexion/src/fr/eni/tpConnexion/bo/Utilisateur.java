package fr.eni.tpConnexion.bo;

public class Utilisateur {
	
	//declaration variables 
	
	private Integer no_utilisateur;
	private String nom;
	private String prenom;
	private String email;
	private String mot_de_passe;
	
	
	
	//constructor
	
	public Utilisateur (Integer no_utilisateur,String nom, String prenom, String email, String mot_de_passe) {
		
		this(nom,prenom,email,mot_de_passe);
				
	}
	

	//Setters
	
	public Utilisateur(String nom, String prenom, String email, String mot_de_passe) {
		
		setNom(nom);
		setPrenom(prenom);
		setEmail(email);
		setMot_de_passe(mot_de_passe);
		
	}

	public Integer getNo_utilisateur() {
		return no_utilisateur;
	}



	public void setNo_utilisateur(Integer no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMot_de_passe() {
		return mot_de_passe;
	}



	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Utilisateur [no_utilisateur="+ no_utilisateur +", nom=" + nom + ", prenom=" + prenom + ", email=" + email+ ", mot_de_passe=" + mot_de_passe + "]";
	}

	
	
	
	
	
	
	
	
	
	

}
