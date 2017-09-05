package com.paul.robert.services;

import java.util.Optional;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Service;

import com.paul.robert.models.License;
import com.paul.robert.repositories.LicenseRepository;

@Service
public class LicenseService {

	@Inject
	private LicenseRepository repo;
	
	public Optional<License> getLicense(@NotBlank String organizationId, @NotBlank String licenseId){
		return Optional.ofNullable(repo.findByOrganizationIdAndLicenseId(organizationId, licenseId));
	}
	
	public License saveLicense(@NotNull License lic){
		return repo.save(lic);
	}
	
}
