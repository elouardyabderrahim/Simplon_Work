package com.rest.brief.project.stc.model;



import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;


@Data
//@Inheritance(strategy=InheritanceType.JOINED),@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="utilisateur_type")
public class Utilisateur {
	@Id
  @Column(name = "Id", columnDefinition = "serial")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;

  @Column(name = "nom")
  private String nom;

  @Column(name = "prenom")
  private String prenom;

  @Column(name = "telephone")
  private String telephone;

  @Column(name = "email")
  private String email;

  @Column(name = "login")
  private String login;

  @Column(name = "pasword")
  private String pasword;

 
}