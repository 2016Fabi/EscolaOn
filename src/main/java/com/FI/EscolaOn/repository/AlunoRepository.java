package com.FI.EscolaOn.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Aluno;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UUID>{

}
