package com.FI.EscolaOn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
