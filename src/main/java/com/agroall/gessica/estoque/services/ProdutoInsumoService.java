package com.agroall.gessica.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.ProdutoInsumo;
import com.agroall.gessica.estoque.repositories.ProdutoInsumoRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ProdutoInsumoService extends ServiceImpl<ProdutoInsumo> {
	
	@Autowired private ProdutoInsumoRepository repository;
	
	@Override
	public ProdutoInsumo factoryNewDataObject() {
		return new ProdutoInsumo();
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
