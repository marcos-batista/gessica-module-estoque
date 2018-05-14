package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.OrcamentoCompra;
import com.agroall.gessica.estoque.services.OrcamentoCompraService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/orcamentocompra")
@CrossOrigin
public class OrcamentoCompraResource extends DataObjectResourceControllerImpl<OrcamentoCompra> {

	@Autowired private OrcamentoCompraService service;
	
	@Override
	protected Service<OrcamentoCompra> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public OrcamentoCompra doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public OrcamentoCompra doPost(@RequestBody OrcamentoCompra orcamentoCompra) {
		orcamentoCompra.setId(null);
		return super.doPost(orcamentoCompra);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public OrcamentoCompra doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public OrcamentoCompra doPut(@PathVariable(value = "id") String id, @RequestBody OrcamentoCompra orcamentoCompra) {
		orcamentoCompra.setId(id);
		return super.doPut(id, orcamentoCompra);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public OrcamentoCompra doDelete(OrcamentoCompra orcamentoCompra) {
		return super.doDelete(orcamentoCompra);
	}

}
