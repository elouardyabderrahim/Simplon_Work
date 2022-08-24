package com.gestiondestaffecole.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.gestiondestaffecole.dao.DaoEtudiant;
import com.gestiondestaffecole.dao.EtudiantImplementation;
import com.gestiondestaffecole.model.Cours;
import com.gestiondestaffecole.model.Etudiant;
import com.gestiondestaffecole.model.Professeur;
import com.gestiondestaffecole.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session =HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		/*Professeur professeur=new Professeur("moster.pro");
		session.save(professeur);
		//session.close();
		////////////////////////////////
		Etudiant etudiant=new Etudiant("Ahmed","5eme",13);
		Etudiant etudiant2=new Etudiant("Ahmed the second","Troncommun",15);
		Etudiant etudiant3=new Etudiant("Ahmedthe third","chahada",1);
		session.save(etudiant);
		session.save(etudiant2);
		session.save(etudiant3);
		 // session.close();
		  ////////////////////////////////
		List etudiantList= new ArrayList();
		etudiantList.add(etudiant);
		etudiantList.add(etudiant3);
		etudiantList.add(etudiant2);

		
		/*Cours cours=new Cours("JAVASCRIPT",professeur,etudiantList);
		session.save(cours);
		session.getTransaction().commit();
		 session.close();
		
		
		/* 
		;*/
		 //Professeur professeur =Cours.getProfesseur() ;
        // System.out.println(professeur );
		EtudiantImplementation EtudiantImplementation=new EtudiantImplementation();
		Etudiant etudiant2=new Etudiant("Amohamed the second","2bac",18);
		EtudiantImplementation.delete(3);
		session.getTransaction().commit();
		session.close();
		
		
		
		
	
		
	}

}
