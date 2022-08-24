package com.rest.brief.project.stc.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rest.brief.project.stc.model.Responsable;
import com.rest.brief.project.stc.service.ResponsableService;

/*@RestController
public class ResponsableController {

    @Autowired
    private ResponsableService responsableService;

  
    @GetMapping("/responsables")
    public Iterable<Responsable> getResponsables() {
        return responsableService.getResponsable();
    }*/
//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/responsable")
public class ResponsableController   {
  @Autowired
  ResponsableService ResponsableService;
  // Insert responsable record
  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Responsable addResponsable(@RequestBody Responsable responsable) {
	  return ResponsableService.saveResponsable(responsable);
  }
  // Fetch all responsable records
  @GetMapping
  public List<Responsable> getAllResponsable(){
    return ResponsableService.getAllResponsable();
  }
  // Fetch single responsable
  @GetMapping("/{id}")
  public Optional<Responsable> getResponsablerById(@PathVariable("id") Long id){
    return ResponsableService.getResponsable(id);
  }
  // Update responsable record
  @PutMapping("/updateresponsable")
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
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteResponsable(@PathVariable Long id){
    try {
    	ResponsableService.deleteResponsable(id);
      return new ResponseEntity<String>(HttpStatus.OK);
    }catch(RuntimeException ex){
      // log the error message
      System.out.println(ex.getMessage());
      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
    }
  }}