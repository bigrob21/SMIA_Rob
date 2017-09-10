package com.paul.robert.controllers;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paul.robert.models.License;
import com.paul.robert.services.LicenseService;

@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
public class LicenseController {

	@Inject
	private LicenseService licenseService;
	
	@RequestMapping(value="/{licenseId}", method=RequestMethod.GET)
	public License getLicenses(@PathVariable("licenseId") String organizationId, 
							   @PathVariable("organizationId") String licenseId){
		return licenseService.getLicense(organizationId, licenseId).get();
	}
	
}
