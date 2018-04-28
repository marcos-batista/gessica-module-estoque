package com.agroall.gessica.estoque.dataobjects;

import com.agroall.gessica.dataobjects.ItemVenda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ItemOrcamentoVenda extends ItemVenda implements Persistent {
	
	private Integer id;

	private ProdutoComercial produto;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public ProdutoComercial getProduto() {
		return produto;
	}
	
	public void setProduto(ProdutoComercial produto) {
		this.produto = produto;
	}
	
}
