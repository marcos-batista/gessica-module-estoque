package com.agroall.gessica.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.estoque.repositories.ProdutoEstoqueRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ProdutoEstoqueService extends ServiceImpl<ProdutoEstoque> {
	
	@Autowired private ProdutoEstoqueRepository repository;
	
	@Override
	public ProdutoEstoque factoryNewDataObject() {
		return new ProdutoEstoque();
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
