package com.FI.EscolaOn.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, UUID>{

}
