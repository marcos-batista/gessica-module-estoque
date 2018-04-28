package com.agroall.gessica.estoque.services;

import com.agroall.gessica.estoque.dataobjects.OrdemCompra;

public class OrdemCompraService extends EstoqueService<OrdemCompra> {

	@Override
	public OrdemCompra factoryNewDataObject() {
		return new OrdemCompra();
	}
	
}
