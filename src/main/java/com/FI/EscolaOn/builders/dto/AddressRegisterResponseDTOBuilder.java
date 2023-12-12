package com.FI.EscolaOn.builders.dto;

import com.FI.EscolaOn.dto.response.AddressRegisterResponseDTO;

public class AddressRegisterResponseDTOBuilder {
     private AddressRegisterResponseDTO entity;
     
     public static AddressRegisterResponseDTOBuilder builder() {
    	 return new AddressRegisterResponseDTOBuilder();
     }
     
     public AddressRegisterResponseDTO build() {
    	 return this.entity;
     }
     
     public AddressRegisterResponseDTOBuilder id(Long id) {
    	 this.entity.setId(id);
    	 return this;
     }
     
     public AddressRegisterResponseDTOBuilder province(String province) {
    	 this.entity.setProvince(province);
    	 return this;
     }
     
     public AddressRegisterResponseDTOBuilder county(String county) {
    	 this.entity.setCounty(county);
    	 return this;
     }
     
     public AddressRegisterResponseDTOBuilder neighborhood(String neighborhood) {
    	 this.entity.setNeighborhood(neighborhood);
    	 return this;
     }
     
     public AddressRegisterResponseDTOBuilder street(String street) {
    	 this.entity.setStreet(street);
    	 return this;
     }
     
}
