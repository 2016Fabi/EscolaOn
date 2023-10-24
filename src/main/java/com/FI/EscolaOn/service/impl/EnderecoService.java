package com.FI.EscolaOn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	EnderecoRepository enderecoRepository;

	public Endereco save(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	public List<Endereco> listar() {
		return enderecoRepository.findAll();
	}

	public void deletar(Long id) {
		enderecoRepository.deleteById(id);
	}

	public Endereco updateEndereco(Endereco endereco, Long id) {
		return enderecoRepository.save(endereco);
	}

	public Endereco findById(Long id) {
		return enderecoRepository.findById(id).get();
	}
}
