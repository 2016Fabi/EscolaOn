package com.FI.EscolaOn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
