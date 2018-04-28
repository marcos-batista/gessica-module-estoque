package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.controllers.GessicaDataObjectResourceController;
import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.estoque.services.ProdutoEstoqueService;
import com.agroall.gessica.services.Service;

public class ProdutoEstoqueResource extends GessicaDataObjectResourceController<ProdutoEstoque> {
	
	@Autowired private ProdutoEstoqueService service;
	
	@Override
	protected Service<ProdutoEstoque> getService() {
		return this.service;
	}

}
