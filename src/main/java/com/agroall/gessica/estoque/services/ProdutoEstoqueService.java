package com.agroall.gessica.estoque.services;

import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;

public class ProdutoEstoqueService extends EstoqueService<ProdutoEstoque> {

	@Override
	public ProdutoEstoque factoryNewDataObject() {
		return new ProdutoEstoque();
	}

}
