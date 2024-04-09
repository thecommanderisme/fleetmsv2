package com.prog.fleetmsv2.parameters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.fleetmsv2.parameters.models.Client;
import com.prog.fleetmsv2.parameters.repositories.ClientRepository;


@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public List<Client> findAll() {
		return (List<Client>) clientRepository.findAll();
	}

	public Client findById(Integer id) {
		return clientRepository.findById(id).orElse(null);
	}

	public void save(Client client) {
		clientRepository.save(client);
	}

	public void deleteById(Integer id) {
		clientRepository.deleteById(id);
	}

	public List<Client> findByDescriptionContaining(String description) {
		return null;
	}
}
