package com.agroall.gessica.estoque.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class OrcamentoCompraRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <OrcamentoCompra> OrcamentoCompra insert_(OrcamentoCompra orcamentoCompra) {
		mongo.insert(orcamentoCompra);
		return orcamentoCompra;
	}
	
	@Override
	public <OrcamentoCompra> OrcamentoCompra update_(OrcamentoCompra orcamentoCompra) {
		mongo.save(orcamentoCompra);
		return orcamentoCompra;
	}
	
	@Override
	public <OrcamentoCompra> void delete_(OrcamentoCompra orcamentoCompra) {
		mongo.remove(orcamentoCompra);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrcamentoCompra> OrcamentoCompra findById_(Object id) {
		com.agroall.gessica.estoque.dataobjects.OrcamentoCompra result = mongo.findById(id, com.agroall.gessica.estoque.dataobjects.OrcamentoCompra.class);
		return (OrcamentoCompra) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrcamentoCompra> Collection<OrcamentoCompra> listAll_() {
		List<com.agroall.gessica.estoque.dataobjects.OrcamentoCompra> result = mongo.findAll(com.agroall.gessica.estoque.dataobjects.OrcamentoCompra.class);
		return (Collection<OrcamentoCompra>) result;
	}
	
}
