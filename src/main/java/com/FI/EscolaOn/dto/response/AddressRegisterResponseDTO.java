package com.FI.EscolaOn.dto.response;

import com.FI.EscolaOn.entity.Address;

public class AddressRegisterResponseDTO {
	
	private Long id;
    private String province;
    private String county;
    private String neighborhood;
    private String street;
    
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


	public AddressRegisterResponseDTO(Address address) {
        this.id = address.getId();
        this.province = address.getProvince();
        this.county = address.getCounty();
        this.neighborhood = address.getNeighborhood();
        this.street = address.getStreet();
    }
}
