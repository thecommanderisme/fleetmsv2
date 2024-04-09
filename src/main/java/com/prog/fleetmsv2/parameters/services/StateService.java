package com.prog.fleetmsv2.parameters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.fleetmsv2.parameters.models.State;
import com.prog.fleetmsv2.parameters.repositories.StateRepository;


@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	
	//Get All Countrys
	public List<State> findAll(){
		return stateRepository.findAll();
	}	
	
	public void save(State state) {
		stateRepository.save(state);
	}
	
	public void update(State state) {
        stateRepository.save(state);
    }
	
	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}
	
	public State findById(Integer id) {
		return stateRepository.findById(id).orElse(null);
	}
}
