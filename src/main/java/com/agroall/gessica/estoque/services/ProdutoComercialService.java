package com.agroall.gessica.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.ProdutoComercial;
import com.agroall.gessica.estoque.repositories.ProdutoComercialRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ProdutoComercialService extends ServiceImpl<ProdutoComercial> {
	
	@Autowired private ProdutoComercialRepository repository;
	
	@Override
	public ProdutoComercial factoryNewDataObject() {
		return new ProdutoComercial();
	}
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}

}
