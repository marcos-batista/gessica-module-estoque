package com.agroall.gessica.estoque.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.agroall.gessica.estoque.dataobjects.Fornecedor;

import com.agroall.gessica.repositories.Repository;

public class FornecedorRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	@SuppressWarnings("hiding")
	public <Fornecedor> Fornecedor insert_(Fornecedor fornecedor) {
		mongo.insert(fornecedor);
		return fornecedor;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <Fornecedor> Fornecedor update_(Fornecedor fornecedor) {
		mongo.save(fornecedor);
		return fornecedor;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <Fornecedor> void delete_(Fornecedor fornecedor) {
		mongo.remove(fornecedor);
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <Fornecedor> Fornecedor findById_(Object id) {
		com.agroall.gessica.estoque.dataobjects.Fornecedor result = mongo.findById(id, com.agroall.gessica.estoque.dataobjects.Fornecedor.class);
		return (Fornecedor) result;
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <Fornecedor> Collection<Fornecedor> listAll_() {
		List<com.agroall.gessica.estoque.dataobjects.Fornecedor> result = mongo.findAll(com.agroall.gessica.estoque.dataobjects.Fornecedor.class);
		return (Collection<Fornecedor>) result;
	}
	
}
