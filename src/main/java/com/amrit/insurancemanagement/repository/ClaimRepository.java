package com.amrit.insurancemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amrit.insurancemanagement.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim , Long>{

}
