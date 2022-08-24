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

import com.rest.brief.project.stc.model.Exercice;
import com.rest.brief.project.stc.service.ExerciceService;



	@RestController
	@RequestMapping("/exercice")
	public class ExerciceController {
	  @Autowired
	  ExerciceService exerciceService;
	  // Insert responsable record
	  @PostMapping("/save")
	  @ResponseStatus(HttpStatus.CREATED)
	  public Exercice addExercice(@RequestBody Exercice exercice) {
		  return exerciceService.savesaveExercice(exercice);
	  }
	  // Fetch all responsable records
	  @GetMapping
	  public List<Exercice> getAllExercice(){
	    return exerciceService.getAllExercice();
	  }
	  // Fetch single responsable
	  @GetMapping("/{id}")
	  public Optional<Exercice> getExerciceById(@PathVariable("id") Long id){
	    return exerciceService.getExercice(id);
	  }
	  // Update responsable record
	  @PutMapping("/updateexercice")
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
	  @DeleteMapping("/{id}")
	  public ResponseEntity<String> deleteExercice(@PathVariable Long id){
	    try {
	    	exerciceService.deleteExercice(id);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(RuntimeException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }}

