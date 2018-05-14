package com.agroall.gessica.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.Fornecedor;
import com.agroall.gessica.estoque.repositories.FornecedorRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class FornecedorService extends ServiceImpl<Fornecedor> {
	
	@Autowired private FornecedorRepository repository;
	
	@Override
	public Fornecedor factoryNewDataObject() {
		return new Fornecedor();
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
