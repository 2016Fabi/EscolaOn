package com.FI.EscolaOn.service;

import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    EnderecoRepository enderecoRepository;
    public Endereco save(Endereco endereco) {
       return enderecoRepository.save(endereco);
    }
}
