package com.qintess.relacionamentos.estudo;

import com.qintess.relacionamentos.estudo.dao.Dao;
import com.qintess.relacionamentos.estudo.entidades.Carrinho;
import com.qintess.relacionamentos.estudo.entidades.Garantia;
import com.qintess.relacionamentos.estudo.entidades.ItemCarrinho;
import com.qintess.relacionamentos.estudo.entidades.Produto;

public class App 
{
    public static void main( String[] args )
    {
    	Dao<Produto> daoProd = new Dao<Produto>();
    	Dao<Carrinho> daoCarrinho = new Dao<Carrinho>();
    	
    	//=============================================
    	
        Garantia garantia = new Garantia(1, "ano");
        
        Produto produto = new Produto("TV LG 55 4k", 1199.99, garantia);
        
        daoProd.insere(produto);
        
        //=============================================
        
        Garantia garantia2 = new Garantia(2, "ano");
        
        Produto produto2 = new Produto("Xiaomi Mi9", 999.98, garantia2);
        
        daoProd.insere(produto2);
        
        //===============================================
        
        ItemCarrinho item = new ItemCarrinho(produto);
        item.setQuantidade(1);
        
        ItemCarrinho item2 = new ItemCarrinho(produto2);
        item2.setQuantidade(2);
        
        Carrinho carrinho = new Carrinho();
        carrinho.adicionaItem(item);
        carrinho.adicionaItem(item2);
        
        daoCarrinho.insere(carrinho);
        
        
        
        
    }
}
