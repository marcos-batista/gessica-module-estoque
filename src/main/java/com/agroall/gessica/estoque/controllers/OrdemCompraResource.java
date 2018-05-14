package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.OrdemCompra;
import com.agroall.gessica.estoque.services.OrdemCompraService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/ordemcompra")
@CrossOrigin
public class OrdemCompraResource extends DataObjectResourceControllerImpl<OrdemCompra> {

	@Autowired private OrdemCompraService service;
	
	@Override
	protected Service<OrdemCompra> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public OrdemCompra doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OrdemCompra doPost(@RequestBody OrdemCompra ordemCompra) {
		ordemCompra.setId(null);
		return super.doPost(ordemCompra);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public OrdemCompra doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public OrdemCompra doPut(@PathVariable(value = "id") String id, @RequestBody OrdemCompra ordemCompra) {
		ordemCompra.setId(id);
		return super.doPut(id, ordemCompra);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public OrdemCompra doDelete(OrdemCompra ordemCompra) {
		return super.doDelete(ordemCompra);
	}

}
