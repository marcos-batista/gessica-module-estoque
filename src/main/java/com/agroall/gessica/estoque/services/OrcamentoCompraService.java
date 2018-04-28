package com.agroall.gessica.estoque.services;

import com.agroall.gessica.estoque.dataobjects.OrcamentoCompra;

public class OrcamentoCompraService extends EstoqueService<OrcamentoCompra> {

	@Override
	public OrcamentoCompra factoryNewDataObject() {
		return new OrcamentoCompra();
	}
	
}
