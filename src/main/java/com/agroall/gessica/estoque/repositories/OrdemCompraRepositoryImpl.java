package com.agroall.gessica.estoque.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.repositories.Repository;

public class OrdemCompraRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	public <OrdemCompra> OrdemCompra insert_(OrdemCompra ordemCompra) {
		mongo.insert(ordemCompra);
		return ordemCompra;
	}
	
	@Override
	public <OrdemCompra> OrdemCompra update_(OrdemCompra ordemCompra) {
		mongo.save(ordemCompra);
		return ordemCompra;
	}
	
	@Override
	public <OrdemCompra> void delete_(OrdemCompra ordemCompra) {
		mongo.remove(ordemCompra);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrdemCompra> OrdemCompra findById_(Object id) {
		com.agroall.gessica.estoque.dataobjects.OrdemCompra result = mongo.findById(id, com.agroall.gessica.estoque.dataobjects.OrdemCompra.class);
		return (OrdemCompra) result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <OrdemCompra> Collection<OrdemCompra> listAll_() {
		List<com.agroall.gessica.estoque.dataobjects.OrdemCompra> result = mongo.findAll(com.agroall.gessica.estoque.dataobjects.OrdemCompra.class);
		return (Collection<OrdemCompra>) result;
	}
	
}
