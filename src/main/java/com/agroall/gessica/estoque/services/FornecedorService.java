package com.agroall.gessica.estoque.services;

import com.agroall.gessica.estoque.dataobjects.Fornecedor;

public class FornecedorService extends EstoqueService<Fornecedor> {

	@Override
	public Fornecedor factoryNewDataObject() {
		return new Fornecedor();
	}
	
}
