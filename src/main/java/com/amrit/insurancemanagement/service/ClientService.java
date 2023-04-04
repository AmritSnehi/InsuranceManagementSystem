package com.amrit.insurancemanagement.service;

import java.util.List;

import com.amrit.insurancemanagement.model.Client;

public interface ClientService {
	
	List<Client> getClients();
	
	Client getClient(Long id);
	
	Client saveClient(Client client);
	
	void deleteClient(Long id);
	
}
