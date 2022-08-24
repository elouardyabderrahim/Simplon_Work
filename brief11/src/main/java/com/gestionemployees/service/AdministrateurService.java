package com.gestionemployees.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestionemployees.model.Administrateur;
import com.gestionemployees.repository.AdministrateurRepository;

public class AdministrateurService  {
	@Autowired
    private AdministrateurRepository administrateurRepository;

    public Administrateur login(String username, String password) {
    	Administrateur admin = administrateurRepository.findByUsernameAndPassword(username, password);
        return admin;
    }

}
