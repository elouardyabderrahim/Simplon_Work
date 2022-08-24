package com.rest.brief.project.stc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Exercice {
	@Id
    @Column(name = "exercice_Id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exercice_Id;

    @Column(name = "DateDebut")
    private Date DateDebut;

    @Column(name = "DateFin")
    private Date DateFin;

    @Column(name = "statut")
    private String statut;
    
//    @ManyToOne
//    @JoinColumn(name="exercice_Id", nullable = false)
//    private Exercice exercice;
    
    
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "exercice_Id", nullable = false)
//    private Exercice exercice;

  
}