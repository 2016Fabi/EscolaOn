package com.FI.EscolaOn.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Prova;

@Repository
public interface ProvaRepository extends JpaRepository<Prova, UUID>{

}
