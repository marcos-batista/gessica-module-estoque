package com.agroall.gessica.estoque.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataCollectionResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.ProdutoInsumo;
import com.agroall.gessica.estoque.services.ProdutoInsumoService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/produtos")
@CrossOrigin
public class ProdutoInsumoCollectionResource extends DataCollectionResourceControllerImpl<ProdutoInsumo> {
	
	@Autowired private ProdutoInsumoService service;
	
	@Override
	protected Service<ProdutoInsumo> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public Collection<ProdutoInsumo> doList() {
		return super.doList();
	}
	
}
