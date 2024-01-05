package com.FI.EscolaOn.mappers.entities;

import com.FI.EscolaOn.builders.dto.AddressRegisterResponseDTOBuilder;
import com.FI.EscolaOn.builders.entities.AddressBuilder;
import com.FI.EscolaOn.dto.request.AddressRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.AddressRegisterResponseDTO;
import com.FI.EscolaOn.entity.Address;

public class AddressMapper {
	public static Address fromAddressRegisterRequest(AddressRegisterRequestDTO request) {
		return AddressBuilder.builder()
				.street(request.getStreet())
				.neighborhood(request.getNeighborhood())
				.province(request.getProvince())
				.county(request.getCounty())
				.build();
	}
	
	public static AddressRegisterResponseDTO fromAddress(Address entity) {
		return AddressRegisterResponseDTOBuilder.builder()
				.street(entity.getStreet())
				.neighborhood(entity.getNeighborhood())
				.province(entity.getProvince())
				.county(entity.getCounty())
				.build();
	}
}
