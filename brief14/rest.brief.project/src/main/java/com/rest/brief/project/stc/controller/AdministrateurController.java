package com.rest.brief.project.stc.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rest.brief.project.stc.model.*;
import com.rest.brief.project.stc.service.*;

	@RestController
	@RequestMapping("/admin")
	public class AdministrateurController{
		///////////////////////////////responsable///////////////////////////////
	  @Autowired(required=true)
	  ResponsableService ResponsableService;
	  
	  
	  // Insert responsable record
	  @PostMapping("/responsable/save")
	  @ResponseStatus(HttpStatus.CREATED)
	  public Responsable addResponsable(@RequestBody Responsable responsable) {
		  return ResponsableService.saveResponsable(responsable);
	  }
	  // Fetch all responsable records
	  @GetMapping("/responsable")
	  public List<Responsable> getAllResponsable(){
	    return ResponsableService.getAllResponsable();
	  }
	  // Fetch single responsable
	  @GetMapping("/responsable/{id}")
	  public Optional<Responsable> getResponsablerById(@PathVariable("id") Long id){
	    return ResponsableService.getResponsable(id);
	  }
	  // Update responsable record
	  @PutMapping("/responsable/update")
	  public ResponseEntity<String> updateResponsable(@RequestBody Responsable responsable) {  
	    try {
	    	ResponsableService.updateResponsable(responsable);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(NoSuchElementException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
	  // Delete responsable record
	  @DeleteMapping("/responsable/{id}")
	  public ResponseEntity<String> deleteResponsable(@PathVariable Long id){
	    try {
	    	ResponsableService.deleteResponsable(id);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(RuntimeException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
	//////////////////////////////////Activite//////////////////////////////////////////
	  @Autowired(required=true)
	  ActviteService activiteService;
	  
	  @PostMapping("/activite/save")
	  @ResponseStatus(HttpStatus.CREATED)
	  public Activite addResponsable(@RequestBody Activite activite) {
		  return activiteService.saveActivite(activite);
	  }
	  // Fetch all responsable records
	  @GetMapping("/activite")
	  public List<Activite> getAllActivite(){
	    return activiteService.getAllActivite();
	  }
	  // Fetch single responsable
	  @GetMapping("/activite/{id}")
	  public Optional<Activite> getActiviteById(@PathVariable("id") Long id){
	    return activiteService.getActivite(id);
	  }
	  // Update responsable record
	  @PutMapping("/activite/update")
	  public ResponseEntity<String> updateActivite(@RequestBody Activite activite) {  
	    try {
	    	activiteService.updateActivite(activite);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(NoSuchElementException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
	  // Delete responsable record
	  @DeleteMapping("/activite/{id}")
	  public ResponseEntity<String> deleteActivite(@PathVariable Long id){
	    try {
	    	activiteService.deleteActivite(id);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(RuntimeException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	}
	  /////:::::::::::::::::::::::::::::::::::::::::::::::Exercice/////////////////////////
	  @Autowired(required=true)
	  ExerciceService exerciceService;
	  // Insert responsable record
	  @PostMapping("/exercice/save")
	  @ResponseStatus(HttpStatus.CREATED)
	  public Exercice addExercice(@RequestBody Exercice exercice) {
		  return exerciceService.savesaveExercice(exercice);
	  }
	  // Fetch all responsable records
	  @GetMapping("/exercice")
	  public List<Exercice> getAllExercice(){
	    return exerciceService.getAllExercice();
	  }
	  // Fetch single responsable
	  @GetMapping("/exercice/{id}")
	  public Optional<Exercice> getExerciceById(@PathVariable("id") Long id){
	    return exerciceService.getExercice(id);
	  }
	  // Update responsable record
	  @PutMapping("/exercice/update")
	  public ResponseEntity<String> updateResponsable(@RequestBody Exercice exercice) {  
	    try {
	    	exerciceService.updateExercice(exercice);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(NoSuchElementException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
	  // Delete responsable record
	  @DeleteMapping("/exercice/{id}")
	  public ResponseEntity<String> deleteExercice(@PathVariable Long id){
	    try {
	    	exerciceService.deleteExercice(id);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(RuntimeException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
	  ////////:::::Participant:::://////////
	  @Autowired(required=true)
	  ParticipantService participantService;
	  // Insert Participant record
	  @PostMapping("/participant/save")
	  @ResponseStatus(HttpStatus.CREATED)
	  public Participant addResponsable(@RequestBody Participant participant) {
		  return participantService.saveParticipant(participant);
	  }
	  // Fetch all responsable records
	  @GetMapping("/participant")
	  public List<Participant> getAllParticipant(){
	    return participantService.getAllParticipant();
	  }
	  // Fetch single responsable
	  @GetMapping("/participant/{id}")
	  public Optional<Participant> getParticipantById(@PathVariable("id") Long id){
	    return participantService.getParticipant(id);
	  }
	  // Update responsable record
	  @PutMapping("/participant/update")
	  public ResponseEntity<String> updateParticipant(@RequestBody Participant participant) {  
	    try {
	    	ParticipantService.updateParticipant(participant);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(NoSuchElementException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
	  // Delete Participant record
	  @DeleteMapping("/participant/{id}")
	  public ResponseEntity<String> deleteParticipant(@PathVariable Long id){
	    try {
	    	participantService.deleteParticipant(id);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(RuntimeException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
	  /////////////////////////////////////////////
	 
	  
	 @Autowired(required=true)
	 AdministateurService AdministateurService; 
	  
	  @PostMapping("/save")
	  @ResponseStatus(HttpStatus.CREATED)
	  public Administrateur addAdministrateur(@RequestBody Administrateur administrateur) {
		  return AdministateurService.saveAdministrateur(administrateur);
	
	}
	 }

