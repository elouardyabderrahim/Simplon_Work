package com.rest.brief.project.stc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rest.brief.project.stc.model.Administrateur;
import com.rest.brief.project.stc.repsitory.AdministateurRepositiry;



@Service 
public class AdministateurService {
	 @Autowired
	    private AdministateurRepositiry AdministateurRepository;

	    public Optional<Administrateur> getResponsable(final Long id) {
	        return AdministateurRepository.findById(id);
	    }

	    public Iterable<Administrateur> getResponsable() {
	        return AdministateurRepository.findAll();
	    }

	    public void deleteResponsable(final Long id) {
	    	AdministateurRepository.deleteById(id);
	    }

	    public Administrateur saveAdministrateur(Administrateur Administrateur) {
	    	Administrateur savedAdministrateur;
			
				savedAdministrateur = AdministateurRepository.save(Administrateur);
			
	        return savedAdministrateur;
	    }
	    public List<Administrateur> getAllResponsable(){
	        return getAllResponsable();
	      }

		public void updateResponsable(Administrateur Administrateur) {
			
			// TODO Auto-generated method stub
			
		}

		

}
