package com.amrit.insurancemanagement.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity

public class Claim {
	@Id
	@NotBlank
	private long claimNumber;
	private String description;
	private LocalDate claimDate;
	private String  claimStatus;
	
	@OneToOne
	private InsurancePolicy insurancePolicy;

	public long getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(long claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(LocalDate claimDate) {
		this.claimDate = claimDate;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public InsurancePolicy getInsurancePolicy() {
		return insurancePolicy;
	}

	public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}

}
