package com.qintess.relacionamentos.estudo.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private double preco;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Garantia garantia;
	
	public Produto() {}
	
	public Produto(String nome, double preco, Garantia garantia) {
		
		this.nome = nome;
		this.preco = preco;
		this.garantia = garantia;
	}



	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}



	public Garantia getGarantia() {
		return garantia;
	}



	public void setGarantia(Garantia garantia) {
		this.garantia = garantia;
	}
	
	

}
