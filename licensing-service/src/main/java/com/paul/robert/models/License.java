package com.paul.robert.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class License {
	
	private String id;
	private String productName;
	private String LicenseType;
	private String organizationId;
	
}
