package com.FI.EscolaOn.dto.request;

import com.FI.EscolaOn.entity.Address;

public class AddressRequestDTO {
	private String province;
	private String county;
	private String neighborhood;
	private String street;
	
	

	public AddressRequestDTO() {

	}

	public AddressRequestDTO(Address entity) {
		this.province = entity.getProvince();
		this.county = entity.getCounty();
		this.neighborhood = entity.getNeighborhood();
		this.street = entity.getStreet();
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
