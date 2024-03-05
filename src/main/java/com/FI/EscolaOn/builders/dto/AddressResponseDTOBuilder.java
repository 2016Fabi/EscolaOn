package com.FI.EscolaOn.builders.dto;

import com.FI.EscolaOn.dto.response.AddressResponseDTO;

public class AddressResponseDTOBuilder {
     private AddressResponseDTO entity;
     
     public static AddressResponseDTOBuilder builder() {
    	 return new AddressResponseDTOBuilder();
     }
     
     public AddressResponseDTO build() {
    	 return this.entity;
     }
     
     public AddressResponseDTOBuilder id(Long id) {
    	 this.entity.setId(id);
    	 return this;
     }
     
     public AddressResponseDTOBuilder province(String province) {
    	 this.entity.setProvince(province);
    	 return this;
     }
     
     public AddressResponseDTOBuilder county(String county) {
    	 this.entity.setCounty(county);
    	 return this;
     }
     
     public AddressResponseDTOBuilder neighborhood(String neighborhood) {
    	 this.entity.setNeighborhood(neighborhood);
    	 return this;
     }
     
     public AddressResponseDTOBuilder street(String street) {
    	 this.entity.setStreet(street);
    	 return this;
     }
     
}
