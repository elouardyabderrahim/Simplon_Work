package com.gestiondestaffecole.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cours {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int coursId;
	private String nameCours;
	@ManyToOne @JoinColumn( name="professeurId" )
	private Professeur professeur;
	

    @ManyToMany
    @JoinTable(name = "etudiant_course", joinColumns = @JoinColumn(name = "coursId"), inverseJoinColumns = @JoinColumn(name = "etudiantId"))
    private List<Etudiant> etudiant = new ArrayList<>();


	public Cours() {
		super();
	}
	



	public Cours(String nameCours, Professeur professeur, List<Etudiant> etudiant) {
		super();
		this.nameCours = nameCours;
		this.professeur = professeur;
		this.etudiant = etudiant;
	}






	public Cours(int coursId, String nameCours, List<Etudiant> etudiant) {
		super();
		this.coursId = coursId;
		this.nameCours = nameCours;
		this.etudiant = etudiant;
	}






	public Cours(int coursId, String nameCours, Professeur professeur) {
		super();
		this.coursId = coursId;
		this.nameCours = nameCours;
		this.setProfesseur( professeur );
		
	}


	public Cours(int coursId, String nameCours) {
		super();
		this.coursId = coursId;
		this.nameCours = nameCours;
	}


	public Cours(String nameCours) {
		super();
		this.nameCours = nameCours;
	}


	


	public int getCoursId() {
		return coursId;
	}






	public void setCoursId(int coursId) {
		this.coursId = coursId;
	}






	public String getNameCours() {
		return nameCours;
	}






	public void setNameCours(String nameCours) {
		this.nameCours = nameCours;
	}






	public Professeur getProfesseur() {
		return professeur;
	}






	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}






	public List<Etudiant> getEtudiant() {
		return etudiant;
	}






	public void setEtudiant(List<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}






	/*@Override
	public String toString() {
		return "Cours [coursId=" + coursId + ", nameCours=" + nameCours + "]";
	}*/
	public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append( "cours de >> " ).append( this.professeur )
               .append( " - " ).append( this.nameCours ).append( "\n" );
        return builder.toString();
    }   
    
	




}


	