package com.qintess.relacionamentos.estudo.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemCarrinho {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double subtotal;
	
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name = "fk_produto_id")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "fk_carrinho_id")
	private Carrinho carrinho;
	
	public ItemCarrinho() {}

	public ItemCarrinho(Produto produto) {
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		this.subtotal = this.quantidade * this.produto.getPreco();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	@Override
	public String toString() {
		return "ItensCarrinho [id=" + id + ", subtotal=" + subtotal + ", quantidade=" + quantidade + ", produto="
				+ produto + ", carrinho=" + carrinho + "]";
	}
	
	
}
