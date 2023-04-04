package com.amrit.insurancemanagement.service;

import java.util.List;

import com.amrit.insurancemanagement.model.Claim;

public interface ClaimService {
	List<Claim> getClaims();
	
	Claim getClaim(Long id);
	
	Claim saveClaim(Claim Claim);
	
	void deleteClaim(Long id);
}
