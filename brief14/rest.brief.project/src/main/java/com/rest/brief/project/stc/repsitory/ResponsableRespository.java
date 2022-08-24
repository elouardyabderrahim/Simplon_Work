package com.rest.brief.project.stc.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.rest.brief.project.stc.model.Responsable;

@Repository
public interface ResponsableRespository extends JpaRepository<Responsable, Long> {
	

}
