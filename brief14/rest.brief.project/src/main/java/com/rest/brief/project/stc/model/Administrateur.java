package com.rest.brief.project.stc.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue("Administrateur")
public class Administrateur extends Utilisateur{
	@Column
    private String etat;
}
