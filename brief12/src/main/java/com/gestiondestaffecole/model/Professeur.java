package com.gestiondestaffecole.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professeur {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int professeurId;
	@Column
	private String nom;
	
	public int getProfesseurId() {
		return professeurId;
	}
	
	
	
	public Professeur() {
		super();
	}



	public Professeur( String nom) {
		super();
		
		this.nom = nom;
	}
	
	
	
	public Professeur(int professeurId, String nom) {
		super();
		this.professeurId = professeurId;
		this.nom = nom;
	}






	public void setProfesseurId(int professeurId) {
		this.professeurId = professeurId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return "Professeur [professeurId=" + professeurId + ", nom=" + nom + "]";
	}
	
	
	
	

}
