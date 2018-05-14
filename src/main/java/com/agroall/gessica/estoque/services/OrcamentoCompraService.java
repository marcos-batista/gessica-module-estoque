package com.agroall.gessica.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.OrcamentoCompra;
import com.agroall.gessica.estoque.repositories.OrcamentoCompraRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class OrcamentoCompraService extends ServiceImpl<OrcamentoCompra> {
	
	@Autowired private OrcamentoCompraRepository repository;
	
	@Override
	public OrcamentoCompra factoryNewDataObject() {
		return new OrcamentoCompra();
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
