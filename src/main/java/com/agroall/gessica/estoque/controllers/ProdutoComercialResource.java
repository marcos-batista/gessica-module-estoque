package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.ProdutoComercial;
import com.agroall.gessica.estoque.services.ProdutoComercialService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/produtocomercial")
@CrossOrigin
public class ProdutoComercialResource extends DataObjectResourceControllerImpl<ProdutoComercial> {
	
	@Autowired private ProdutoComercialService service;
	
	@Override
	protected Service<ProdutoComercial> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ProdutoComercial doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ProdutoComercial doPost(@RequestBody ProdutoComercial produtoComercial) {
		produtoComercial.setId(null);
		return super.doPost(produtoComercial);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ProdutoComercial doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ProdutoComercial doPut(@PathVariable(value = "id") String id, @RequestBody ProdutoComercial produtoComercial) {
		produtoComercial.setId(id);
		return super.doPut(id, produtoComercial);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ProdutoComercial doDelete(ProdutoComercial produtoComercial) {
		return super.doDelete(produtoComercial);
	}
	
}
