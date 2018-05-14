package com.agroall.gessica.estoque.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.agroall.gessica.estoque.dataobjects.ProdutoComercial;

import com.agroall.gessica.repositories.Repository;

public class ProdutoComercialRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	@SuppressWarnings("hiding")
	public <ProdutoComercial> ProdutoComercial insert_(ProdutoComercial produtoComercial) {
		mongo.insert(produtoComercial);
		return produtoComercial;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <ProdutoComercial> ProdutoComercial update_(ProdutoComercial produtoComercial) {
		mongo.save(produtoComercial);
		return produtoComercial;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <ProdutoComercial> void delete_(ProdutoComercial produtoComercial) {
		mongo.remove(produtoComercial);
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <ProdutoComercial> ProdutoComercial findById_(Object id) {
		com.agroall.gessica.estoque.dataobjects.ProdutoComercial result = mongo.findById(id, com.agroall.gessica.estoque.dataobjects.ProdutoComercial.class);
		return (ProdutoComercial) result;
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <ProdutoComercial> Collection<ProdutoComercial> listAll_() {
		List<com.agroall.gessica.estoque.dataobjects.ProdutoComercial> result = mongo.findAll(com.agroall.gessica.estoque.dataobjects.ProdutoComercial.class);
		return (Collection<ProdutoComercial>) result;
	}
	
}
