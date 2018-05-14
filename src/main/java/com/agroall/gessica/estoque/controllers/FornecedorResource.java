package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.Fornecedor;
import com.agroall.gessica.estoque.services.FornecedorService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/fornecedor")
@CrossOrigin
public class FornecedorResource extends DataObjectResourceControllerImpl<Fornecedor> {

	@Autowired private FornecedorService service;
	
	@Override
	protected Service<Fornecedor> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Fornecedor doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Fornecedor doPost(@RequestBody Fornecedor fornecedor) {
		fornecedor.setId(null);
		return super.doPost(fornecedor);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Fornecedor doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Fornecedor doPut(@PathVariable(value = "id") String id, @RequestBody Fornecedor fornecedor) {
		fornecedor.setId(id);
		return super.doPut(id, fornecedor);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public Fornecedor doDelete(Fornecedor fornecedor) {
		return super.doDelete(fornecedor);
	}

}
