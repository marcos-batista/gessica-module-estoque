package com.agroall.gessica.estoque.services;

import com.agroall.gessica.estoque.dataobjects.OrcamentoVenda;

public class OrcamentoVendaService extends EstoqueService<OrcamentoVenda> {

	@Override
	public OrcamentoVenda factoryNewDataObject() {
		return new OrcamentoVenda();
	}

}
