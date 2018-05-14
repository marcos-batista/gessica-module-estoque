package com.agroall.gessica.estoque.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.estoque.services.ProdutoEstoqueService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/produtosestoque")
@CrossOrigin
public class ProdutoEstoqueCollectionResource extends DataCollectionResourceControllerImpl<ProdutoEstoque> {
	
	@Autowired private ProdutoEstoqueService service;
	
	@Override
	protected Service<ProdutoEstoque> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<ProdutoEstoque> doList() {
		return super.doList();
	}
	
}
