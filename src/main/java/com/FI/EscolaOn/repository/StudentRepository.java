package com.FI.EscolaOn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FI.EscolaOn.entity.Student;

import jakarta.transaction.Transactional;


@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    boolean existsBycpf(String cpf);
}
