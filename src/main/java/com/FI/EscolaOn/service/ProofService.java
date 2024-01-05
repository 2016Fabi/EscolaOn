package com.FI.EscolaOn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.dto.request.ProofRegisterRequestDTO;
import com.FI.EscolaOn.dto.response.ProofRegisterResponseDTO;
import com.FI.EscolaOn.dto.response.ProofResponseFindAllDTO;
import com.FI.EscolaOn.mappers.entities.ProofMapper;
import com.FI.EscolaOn.repository.ProofRepository;

@Service
public class ProofService {

	@Autowired
	private ProofRepository repository;

	public ProofRegisterResponseDTO register(ProofRegisterRequestDTO request) {
		return ProofMapper.fromProof(repository.save(ProofMapper.fromProofRegisterRequest(request)));
	}

	public List<ProofResponseFindAllDTO> findAll() {
		return repository.findAll().stream().map(ProofResponseFindAllDTO::new).toList();
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
