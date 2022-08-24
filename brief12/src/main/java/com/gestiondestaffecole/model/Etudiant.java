package com.gestiondestaffecole.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


@Entity
public class Etudiant {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private int etudiantId;
	private String nom;
	private String niveau;
	private int note;
	@ManyToMany
    @JoinTable(name = "etudiant_course", joinColumns = @JoinColumn(name = "etudiantId"), inverseJoinColumns = @JoinColumn(name = "coursId"))
	private List<Cours> cours = new ArrayList<>(); ;
	
	
	public Etudiant() {
		super();
	}


	public Etudiant(int etudiantId, String nom, String niveau, int note) {
		super();
		this.etudiantId = etudiantId;
		this.nom = nom;
		this.niveau = niveau;
		this.note = note;
		
	}
	public Etudiant( String nom, String niveau, int note) {
		super();
		
		this.nom = nom;
		this.niveau = niveau;
		this.note = note;
		
	}


	public int getEtudiantId() {
		return etudiantId;
	}


	public void setEtudiantId(int etudiantId) {
		this.etudiantId = etudiantId;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	public int getNote() {
		return note;
	}


	public void setNote(int note) {
		this.note = note;
	}


	public List<Cours> getCours() {
		return cours;
	}


	 
	
	
	@Override
	public String toString() {
		return "Etudiant [etudiantId=" + etudiantId + ", nom=" + nom + ", niveau=" + niveau + ", note=" + note + "]";
	}
	
	






	
	
	
}
