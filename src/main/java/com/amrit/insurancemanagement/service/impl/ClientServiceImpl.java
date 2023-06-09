package com.amrit.insurancemanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amrit.insurancemanagement.model.Client;
import com.amrit.insurancemanagement.repository.ClientRepository;
import com.amrit.insurancemanagement.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client getClient(Long id) {
	Optional<Client> client = clientRepository.findById(id);
	if(client.isPresent()) {
		client.get();
	  }
	return null;
	}

	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(Long id) {

		clientRepository.deleteById(id);
	
	}

}
