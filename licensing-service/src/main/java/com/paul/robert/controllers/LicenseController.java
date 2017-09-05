package com.paul.robert.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paul.robert.models.License;

@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
public class LicenseController {

	@RequestMapping(value="/{licenseId}", method=RequestMethod.GET)
	public License getLicenses(@PathVariable("licenseId") String organizationId, 
							   @PathVariable("organizationId") String licenseId){
		return License.builder()
		.licenseId(licenseId)
		.productName("Teleco")
		.licenseType("Seat")
		.organizationId(organizationId)
		.build();
	}
	
}
