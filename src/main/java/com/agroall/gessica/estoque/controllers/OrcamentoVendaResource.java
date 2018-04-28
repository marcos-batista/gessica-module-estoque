package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.controllers.GessicaDataObjectResourceController;
import com.agroall.gessica.estoque.dataobjects.OrcamentoVenda;
import com.agroall.gessica.estoque.services.OrcamentoVendaService;
import com.agroall.gessica.services.Service;

public class OrcamentoVendaResource extends GessicaDataObjectResourceController<OrcamentoVenda> {

	@Autowired private OrcamentoVendaService service;
	
	@Override
	protected Service<OrcamentoVenda> getService() {
		return this.service;
	}

}
