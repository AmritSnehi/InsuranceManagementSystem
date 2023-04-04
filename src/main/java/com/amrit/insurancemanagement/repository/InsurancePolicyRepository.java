package com.amrit.insurancemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amrit.insurancemanagement.model.InsurancePolicy;


public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long>{

}
