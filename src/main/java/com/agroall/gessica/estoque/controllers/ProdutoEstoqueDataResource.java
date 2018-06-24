package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.estoque.services.ProdutoEstoqueService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/estoque/produto")
@CrossOrigin
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
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ProdutoEstoque doPost(@RequestBody ProdutoEstoque produtoEstoque) {
		produtoEstoque.setId(null);
		return super.doPost(produtoEstoque);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ProdutoEstoque doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ProdutoEstoque doPut(@PathVariable(value = "id") String id, @RequestBody ProdutoEstoque produtoEstoque) {
		produtoEstoque.setId(id);
		return super.doPut(id, produtoEstoque);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ProdutoEstoque doDelete(ProdutoEstoque produtoEstoque) {
		return super.doDelete(produtoEstoque);
	}

}
