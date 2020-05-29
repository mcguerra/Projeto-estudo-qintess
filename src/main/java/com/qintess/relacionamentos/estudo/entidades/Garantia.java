package com.qintess.relacionamentos.estudo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Garantia {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int prazo;
	
	private String tipo; //meses ou anos
	
	public Garantia() {}
	

	public Garantia(int prazo, String tipo) {
		
		this.prazo = prazo;
		this.tipo = tipo;
	}
	


	@Override
	public String toString() {
		return "Garantia [id=" + id + ", prazo=" + prazo + ", tipo=" + tipo + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
