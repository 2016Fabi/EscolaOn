package com.FI.EscolaOn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	
}
