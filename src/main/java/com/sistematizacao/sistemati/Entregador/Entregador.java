package com.sistematizacao.sistemati.Entregador;

import java.util.Objects;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "entregadores" )
@Entity
public class Entregador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cpf;
    private String nome;
    @Column(name = "capacidadeveiculo" )
    private int capacidadeVeiculo;
    	
    	
    
	public Entregador(Long id, String cpf, String nome, int capacidadeVeiculo) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.capacidadeVeiculo = capacidadeVeiculo;
	}

	


	public Entregador() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
	}
	
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidadeVeiculo() {
		return capacidadeVeiculo;
	}
	public void setCapacidadeVeiculo(int capacidadeVeiculo) {
		this.capacidadeVeiculo = capacidadeVeiculo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entregador other = (Entregador) obj;
		return Objects.equals(id, other.id);
	}

    // getters e setters
	
}
