package com.amrit.insurancemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.amrit.insurancemanagement.model.Client;

@Service
public interface ClientRepository extends JpaRepository<Client, Long>{

}
