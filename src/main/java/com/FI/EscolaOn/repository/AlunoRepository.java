package com.FI.EscolaOn.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Aluno;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UUID>{
      @Query("select a from Aluno a")
      public List<Aluno> listar();
      @Query("select a from Aluno a")
      public void deleteById();
}
