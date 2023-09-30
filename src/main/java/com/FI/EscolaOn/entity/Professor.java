package com.FI.EscolaOn.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_Professor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String nome;
	private String enderero;
	private String senha;
	private String cpf;
	private String niveldeacesso;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Prova> prova;
    
    
}
