package com.paul.robert.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="licenses")
public class License {
	
	@Id
	@Column(name="lic_id", nullable=false)
	private String licenseId;
	@Column(name="prod_name")
	private String productName;
	@Column(name="lic_type")
	private String licenseType;
	@Column(name="org_id")
	private String organizationId;
	
}
