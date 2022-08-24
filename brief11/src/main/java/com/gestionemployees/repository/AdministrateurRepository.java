package com.gestionemployees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionemployees.model.Administrateur;


public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {
	
	Administrateur findByUsernameAndPassword(String username, String password);

}
