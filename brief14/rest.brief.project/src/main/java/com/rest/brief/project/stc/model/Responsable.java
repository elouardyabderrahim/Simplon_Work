package com.rest.brief.project.stc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.Data;


@Data
@Entity
@DiscriminatorValue("Responsable")
public class Responsable extends Utilisateur {
	
	@Column(name = "domaine")
    private String domaine;

    @Column(name = "type")
    private String type;

    @Column(name = "etat")
    private String etat;
    
//    @OneToMany(cascade = CascadeType.ALL,
//            mappedBy = "responsable")
// private List<Activite> activite;
    
    @OneToMany(mappedBy = "responsable")
	private List<Activite> activite;
}