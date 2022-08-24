package com.rest.brief.project.stc.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.brief.project.stc.model.Participant;
import com.rest.brief.project.stc.repsitory.ParticipantRepository;

@Service
public class ParticipantService {
	
	 @Autowired
	    private ParticipantRepository participantRepository;

	    public Optional<Participant> getParticipant(final Long id) {
	        return participantRepository.findById(id);
	    }

	    public Iterable<Participant> getParticipant() {
	        return participantRepository.findAll();
	    }

	    public void deleteParticipant(final Long id) {
	    	participantRepository.deleteById(id);
	    }

	    public Participant saveParticipant(Participant participant) {
	    	Participant savedParticipant = participantRepository.save(participant);
	        return savedParticipant;
	    }
	    public List<Participant> getAllParticipant(){
	        return participantRepository.findAll();
	      }

		

		public static void updateParticipant(Participant participant) {
			// TODO Auto-generated method stub
			
		}
}
