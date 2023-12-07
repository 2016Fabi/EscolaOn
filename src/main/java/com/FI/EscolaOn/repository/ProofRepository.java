package com.FI.EscolaOn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Proof;

@Repository
public interface ProofRepository extends JpaRepository<Proof, Long>{

}
