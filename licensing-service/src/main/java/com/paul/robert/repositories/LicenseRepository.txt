package com.paul.robert.repositories;

import org.springframework.data.repository.CrudRepository;

import com.paul.robert.models.License;

public interface LicenseRepository extends CrudRepository<License, String> {
	public License findByOrganizationId(String oid);
	public License findByOrganizationIdAndLicenseId(String oid, String lid);
}
