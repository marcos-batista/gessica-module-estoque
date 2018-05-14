package com.agroall.gessica.estoque.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.OrcamentoCompra;
import com.agroall.gessica.estoque.services.OrcamentoCompraService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/orcamentoscompra")
@CrossOrigin
public class OrcamentoCompraCollectionResource extends DataCollectionResourceControllerImpl<OrcamentoCompra> {
	
	@Autowired private OrcamentoCompraService service;
	
	@Override
	protected Service<OrcamentoCompra> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<OrcamentoCompra> doList() {
		return super.doList();
	}
	
}
