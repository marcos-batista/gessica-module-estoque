package com.agroall.gessica.estoque.dataobjects;

import com.agroall.gessica.dataobjects.ItemVenda;

public class ItemOrcamentoVenda extends ItemVenda {
	
	private ProdutoComercial produto;
	
	public ProdutoComercial getProduto() {
		return produto;
	}
	
	public void setProduto(ProdutoComercial produto) {
		this.produto = produto;
	}
	
}
