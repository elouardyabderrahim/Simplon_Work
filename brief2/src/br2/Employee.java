package br2;
//import java.util.Scanner;
//public class Employee {
//	
//	private String nom;
//	private String prenom;
//	private String dateDeNessance;
//
//	public String getNom() {
//		return nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//	public String getPrenom() {
//		return nom;
//	}
//
//	public void setPrenom(String prenom) {
//		this.prenom=prenom;
//		}
//	
//	public Employee(String prenom) {
//		
//		this.prenom = prenom;
//	}
////	public String getdateDeNessance() {
////		return dateDeNessance;
////	}
//
////	public void setdateDeNessance(String dateDeNessance) {
////		this.dateDeNessance = dateDeNessance;
////	}
//public Employee(String prenom, String nom,String dateDeNessance) {
//		
//		this.prenom = prenom;
//		this.nom = nom;
////		this.dateDeNessance=dateDeNessance;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [nom=" + nom + ", prenom=" + prenom + "]";
//	}
//
//
//	
//			
//	}

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private String Firstname;
	private String Lastname;
    private double salaire;
	Date Datebirth = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    String strDate = formatter.format(Datebirth);
	
	public Employee(String firstname, String lastname,double salaire ,String strDate) {
		super();
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.salaire= salaire;
		this.strDate = strDate;
		
	}

	public Employee(String firstname, String lastname ,String strDate) {
		super();
		this.Firstname = firstname;
		this.Lastname = lastname;
	
		this.strDate = strDate;
		
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Date getDatebirth() {
		return Datebirth;
	}

	public void setstrDate(String strDate) {
		this.strDate = strDate;
	}
	
	


	@Override
	public String toString() {
		return "Employes [First Name :" + Firstname + ", Last Name:" + Lastname + ", Salaire:" + salaire + ", Datebirth:"
				+ strDate + "]";
	}

//	public  abstract double calculerSalaire();
	
	
	
	
	



}