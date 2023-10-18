package com.FI.EscolaOn.service;

import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepositorym;
    public Curso save(Curso curso) {
        return cursoRepositorym.save(curso);

    }
}
