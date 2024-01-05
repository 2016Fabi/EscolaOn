package com.FI.EscolaOn.dto.response;

import com.FI.EscolaOn.entity.Address;

public class AddressResponseFindAllDTO {
	private Long id;
    private String province;
    private String county;
    private String neighborhood;
    private String street;
    
    
	public AddressResponseFindAllDTO(Address entity) {
		this.id = entity.getId();
		this.province = entity.getProvince();
		this.county = entity.getCounty();
		this.neighborhood = entity.getNeighborhood();
		this.street = entity.getStreet();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
