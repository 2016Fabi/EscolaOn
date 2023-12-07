package com.FI.EscolaOn.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Address;
import com.FI.EscolaOn.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	public Address save(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> findAll() {
		return addressRepository.findAll();	
	}

	public void deletar(Long id) {
		addressRepository.deleteById(id);
	}

	public Address updateAddress(Address address, Long id) {
		return addressRepository.save(address);
	}

	public Address findById(Long id) {
		Optional<Address> obj = addressRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id:" + id + ", Tipo: " + Address.class.getName(), obj));
	}
}
