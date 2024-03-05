package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.response.AddressResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.AddressBuilder;
import com.FI.EscolaOn.dto.request.AddressRequestDTO;
import com.FI.EscolaOn.dto.response.AddressResponseDTO;
import com.FI.EscolaOn.entity.Address;

public class AddressMapper {
	public static Address fromAddressRegisterRequest(AddressRequestDTO request) {
		return AddressBuilder.builder()
				.street(request.getStreet())
				.neighborhood(request.getNeighborhood())
				.province(request.getProvince())
				.county(request.getCounty())
				.build();
	}
	
	public static AddressResponseDTO fromAddress(Address entity) {
		return AddressResponseDTOBuilder.builder()
				.street(entity.getStreet())
				.neighborhood(entity.getNeighborhood())
				.province(entity.getProvince())
				.county(entity.getCounty())
				.build();
	}
}
