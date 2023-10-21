package com.FI.EscolaOn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FI.EscolaOn.entity.Prova;
import com.FI.EscolaOn.repository.ProvaRepository;


@Service
public class ProvaService {
	
	@Autowired
	ProvaRepository provaRepository;
	
	public Prova save(Prova prova) {
		return provaRepository.save(prova);		
	}
	
	public List<Prova> listar(){
		return provaRepository.findAll();		
	}
	
	public void deletar(Long id) {
		provaRepository.deleteById(id);
	}
	
	public Prova updateProva(Prova prova, Long id) {
		return provaRepository.save(prova);
	}

}
