package com.agroall.gessica.estoque.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.Fornecedor;
import com.agroall.gessica.estoque.services.FornecedorService;
import com.agroall.gessica.services.Service;

@RestController
@CrossOrigin
@RequestMapping("/fornecedores")
public class FornecedorCollectionResource extends DataCollectionResourceControllerImpl<Fornecedor> {
	
	@Autowired private FornecedorService service;
	
	@Override
	protected Service<Fornecedor> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Fornecedor> doList() {
		return super.doList();
	}
	
}
