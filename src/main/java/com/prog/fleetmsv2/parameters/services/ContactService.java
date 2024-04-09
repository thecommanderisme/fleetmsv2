package com.prog.fleetmsv2.parameters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.fleetmsv2.parameters.models.Contact;
import com.prog.fleetmsv2.parameters.repositories.ContactRepository;


@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	
	//Get All Contact
	public List<Contact> findAll(){
		return contactRepository.findAll();
	}	
	
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
	
	public void update(Contact contact) {
		contactRepository.save(contact);
    }
	
	public void delete(Integer id) {
		contactRepository.deleteById(id);
	}
	
	public Contact getById(Integer id) {
		return contactRepository.findById(id).orElse(null);
	}
}
