package com.FI.EscolaOn.service;

import java.util.List;
//import java.util.Optional;

//import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.dto.request.AddressRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.AddressRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.AddressResponseFindAllDTO;
import com.FI.EscolaOn.mappers.entities.AddressMapper;
import com.FI.EscolaOn.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repository;

	
	public AddressRegisterResponseDTO register(AddressRegisterRequestDTO request) {
		return AddressMapper.fromAddress(repository.save(AddressMapper.fromAddressRegisterRequest(request)));
	}

	public List<AddressResponseFindAllDTO> findAll() {
		return repository.findAll().stream().map(AddressResponseFindAllDTO::new).toList();	
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
