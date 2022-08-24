package com.rest.brief.project.stc.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table
public class Activite {
	@Id
    @Column(name = "activite_Id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activite_Id;

    @Column(name = "DateDebut")
    private Date DateDebut;

    @Column(name = "DateFin")
    private Date DateFin;

    @Column(name = "titre")
    private String titre;

    @Column(name = "descriptif")
    private String descriptif;

    @Column(name = "type")
    private String type;

    @Column(name = "etat")
    private String etat;
    
    
//    @OneToMany(mappedBy="exercice")
//    private Set<Activite> activites;
    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "activite_Id", nullable= false)
//    private Responsable responsable;
    
    @ManyToOne
	@JoinColumn(name = "responsable_Id")
	private Responsable responsable;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "activite_id", referencedColumnName = "activite_id")
    private List<Exercice> exercice;
    
    @ManyToMany(mappedBy = "activites")
    private Set<Participant> participant = new HashSet<>();
    
    
}