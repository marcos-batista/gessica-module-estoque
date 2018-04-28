package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.controllers.GessicaDataObjectResourceController;
import com.agroall.gessica.estoque.dataobjects.Fornecedor;
import com.agroall.gessica.estoque.services.FornecedorService;
import com.agroall.gessica.services.Service;

public class FornecedorResource extends GessicaDataObjectResourceController<Fornecedor> {

	@Autowired private FornecedorService service;
	
	@Override
	protected Service<Fornecedor> getService() {
		return this.service;
	}

}
