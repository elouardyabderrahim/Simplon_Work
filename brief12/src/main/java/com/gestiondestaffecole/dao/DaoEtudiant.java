package com.gestiondestaffecole.dao;

import java.util.List;

import com.gestiondestaffecole.model.Administrateur;
import com.gestiondestaffecole.model.Etudiant;
import com.gestiondestaffecole.model.Professeur;




	public interface DaoEtudiant<Etudiant> {

		List<Etudiant> getAll();

		

		boolean add(Etudiant etudiant);

		boolean delete(long etudiantId);

		boolean update(Etudiant etudiant);

		Etudiant getById(int EtudiantId);
		
		
		/*List<Administrateur> selectAllAdmins();

		void insertAdmin(Administrateur administrateur);

		void insertEmployee(Professeur professeur);

		Professeur selectEmploye(Integer id);

		Administrateur selectAdmin(Long id);

		void updateAdmin(Administrateur administrateur);

		void updateEmploye(Professeur professeur);

		boolean deleteEmploye(int id);

		List<Professeur> selectAllProfesseur();
		 boolean validate(String username, String password);*/

}
