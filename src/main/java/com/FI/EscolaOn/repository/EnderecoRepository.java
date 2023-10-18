package com.FI.EscolaOn.repository;

import com.FI.EscolaOn.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,UUID> {
}
