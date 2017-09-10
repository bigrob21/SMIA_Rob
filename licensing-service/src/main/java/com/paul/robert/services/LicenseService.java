package com.paul.robert.services;

import java.util.Optional;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Service;

import com.paul.robert.models.License;

@Service
public class LicenseService {

//	@Inject
//	private LicenseRepository repo;
	
	public Optional<License> getLicense(@NotBlank String organizationId, @NotBlank String licenseId){
		//return Optional.ofNullable(repo.findByOrganizationIdAndLicenseId(organizationId, licenseId));
		return dummyValue();
	}
	
	public License saveLicense(@NotNull License lic){
		//return repo.save(lic);
		return dummyValue().get();
	}
	
	private Optional<License> dummyValue(){
		License retVal = License.builder()
				.licenseId(UUID.randomUUID().toString())
				.productName("Teleco")
				.licenseType("Seat")
				.organizationId(UUID.randomUUID().toString())
				.build();
		return Optional.ofNullable(retVal);
	}
	
}
