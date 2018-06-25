package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.estoque.services.ProdutoEstoqueService;
import com.agroall.gessica.services.Service;

@RestController
@CrossOrigin
@RequestMapping("/produto/estoque")
public class ProdutoEstoqueDataResource extends DataObjectResourceControllerImpl<ProdutoEstoque> {
	
	@Autowired private ProdutoEstoqueService service;
	
	@Override
	protected Service<ProdutoEstoque> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ProdutoEstoque doGet() {
		return super.doGet();
	}
	
}
