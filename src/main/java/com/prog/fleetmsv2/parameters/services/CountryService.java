package com.prog.fleetmsv2.parameters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.fleetmsv2.parameters.models.Country;
import com.prog.fleetmsv2.parameters.repositories.CountryRepository;


@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	
	//Get All Countrys
	public List<Country> findAll(){
		return countryRepository.findAll();
	}	
	
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	public void update(Country country) {
        countryRepository.save(country);
    }
	
	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}
	
	public Country getById(Integer id) {
		return countryRepository.findById(id).orElse(null);
	}
}
