package com.FI.EscolaOn.service;

import java.util.List;
//import java.util.Optional;

//import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.dto.request.AddressRequestDTO;
import com.FI.EscolaOn.dto.response.AddressResponseDTO;
import com.FI.EscolaOn.mappers.entities.AddressMapper;
import com.FI.EscolaOn.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repository;

	
	public AddressResponseDTO register(AddressRequestDTO request) {
		return AddressMapper.fromAddress(repository.save(AddressMapper.fromAddressRegisterRequest(request)));
	}

	public List<AddressResponseDTO> findAll() {
		return repository.findAll().stream().map(AddressResponseDTO::new).toList();	
	}

//	public void deletar(Long id) {
//		addressRepository.deleteById(id);
//	}
//
//	public Address updateAddress(Address address, Long id) {
//		return addressRepository.save(address);
//	}
//
//	public Address findById(Long id) {
//		Optional<Address> obj = addressRepository.findById(id);
//		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Address.class.getName(), obj));
//	}
}
