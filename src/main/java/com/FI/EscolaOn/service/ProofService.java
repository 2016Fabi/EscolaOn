package com.FI.EscolaOn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.dto.request.ProofRequestDTO;
import com.FI.EscolaOn.dto.response.ProofResponseDTO;
import com.FI.EscolaOn.mappers.entities.ProofMapper;
import com.FI.EscolaOn.repository.ProofRepository;

@Service
public class ProofService {

	@Autowired
	private ProofRepository repository;

	public ProofResponseDTO register(ProofRequestDTO request) {
		return ProofMapper.fromProof(repository.save(ProofMapper.fromProofRegisterRequest(request)));
	}

	public List<ProofResponseDTO> findAll() {
		return repository.findAll().stream().map(ProofResponseDTO::new).toList();
	}

//	public void deletar(Long id) {
//		provaRepository.deleteById(id);
//	}
//
//	public Proof updateProva(Proof prova, Long id) {
//		return provaRepository.save(prova);
//	}
//
//	public Proof findById(Long id) {
//		return provaRepository.findById(id).get();
//	}

}
