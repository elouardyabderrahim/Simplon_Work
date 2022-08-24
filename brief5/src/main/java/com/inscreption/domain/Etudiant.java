package com.inscreption.domain;



import java.sql.Date;

public class Etudiant {
	private int id;
	private String nom,prenom,email,adress,ville,pays;
	
	public Etudiant( String nom, String prenom, String email, String adress, String ville,
			String pays) {
		//nom prenom email adress ville pays
		this.nom = nom ;
		this.prenom = prenom;
		this.email = email;
		this.adress = adress;
		this.ville = ville;
		this.pays = pays;

	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setIdUser(int id) {
//		this.id = id;
//	}
//
//	public String getnom() {
//		return nom;
//	}
//
//	public void setFirstname(String nom) {
//		this.firstname = firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getAdresse() {
//		return adresse;
//	}
//
//	public void setAdresse(String adresse) {
//		this.adresse = adresse;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAdress() {
		return adress;
	}

	public void setAdresse(String adress) {
		this.adress = adress;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "nom: " + nom+ "  prenom: " + prenom + "  email: " + email + "  adress: " + adress
				+ "  city: " + ville + "  country: " + pays + "";
	}
	
	

}