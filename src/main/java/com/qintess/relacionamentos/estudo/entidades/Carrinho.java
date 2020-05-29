package com.qintess.relacionamentos.estudo.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrinho {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double total;
	
	@OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();
	
	public void adicionaItem(ItemCarrinho item) {
		itens.add(item);
		item.setCarrinho(this);
		for (ItemCarrinho itemCarrinho : itens) {
			this.total += itemCarrinho.getSubtotal();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<ItemCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Carrinho [id=" + id + ", total=" + total + ", itens=" + itens + "]";
	}
	
	

}
