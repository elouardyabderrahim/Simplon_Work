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

import com.rest.brief.project.stc.model.Participant;
import com.rest.brief.project.stc.service.ParticipantService;


	@RestController
	@RequestMapping("/Participant")
	public class ParticipantController {
	  @Autowired
	  ParticipantService participantService;
	  // Insert Participant record
	  @PostMapping("/save")
	  @ResponseStatus(HttpStatus.CREATED)
	  public Participant addResponsable(@RequestBody Participant participant) {
		  return participantService.saveParticipant(participant);
	  }
	  // Fetch all responsable records
	  @GetMapping
	  public List<Participant> getAllParticipant(){
	    return participantService.getAllParticipant();
	  }
	  // Fetch single responsable
	  @GetMapping("/{id}")
	  public Optional<Participant> getResponsablerById(@PathVariable("id") Long id){
	    return participantService.getParticipant(id);
	  }
	  // Update responsable record
	  @PutMapping("/updateparticipant")
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
	  @DeleteMapping("/{id}")
	  public ResponseEntity<String> deleteParticipant(@PathVariable Long id){
	    try {
	    	participantService.deleteParticipant(id);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(RuntimeException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }}

