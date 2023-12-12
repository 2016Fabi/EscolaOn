package com.FI.EscolaOn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Proof;
import com.FI.EscolaOn.repository.ProofRepository;

@Service
public class ProofService {

	@Autowired
	ProofRepository provaRepository;

	public Proof save(Proof prova) {
		return provaRepository.save(prova);
	}

	public List<Proof> findAll() {
		return provaRepository.findAll();
	}

	public void deletar(Long id) {
		provaRepository.deleteById(id);
	}

	public Proof updateProva(Proof prova, Long id) {
		return provaRepository.save(prova);
	}

	public Proof findById(Long id) {
		return provaRepository.findById(id).get();
	}

}
