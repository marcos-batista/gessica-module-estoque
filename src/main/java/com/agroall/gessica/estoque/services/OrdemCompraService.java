package com.agroall.gessica.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.OrdemCompra;
import com.agroall.gessica.estoque.repositories.OrdemCompraRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class OrdemCompraService extends ServiceImpl<OrdemCompra> {
	
	@Autowired private OrdemCompraRepository repository;
	
	@Override
	public OrdemCompra factoryNewDataObject() {
		return new OrdemCompra();
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
