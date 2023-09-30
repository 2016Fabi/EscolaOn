package com.FI.EscolaOn.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, UUID>{

}
