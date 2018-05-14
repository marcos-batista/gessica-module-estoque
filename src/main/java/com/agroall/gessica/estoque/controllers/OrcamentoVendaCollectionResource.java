package com.agroall.gessica.estoque.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.OrcamentoVenda;
import com.agroall.gessica.estoque.services.OrcamentoVendaService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/orcamentosvenda")
@CrossOrigin
public class OrcamentoVendaCollectionResource extends DataCollectionResourceControllerImpl<OrcamentoVenda> {
	
	@Autowired private OrcamentoVendaService service;
	
	@Override
	protected Service<OrcamentoVenda> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<OrcamentoVenda> doList() {
		return super.doList();
	}
	
}
