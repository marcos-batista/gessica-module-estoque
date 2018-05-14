package com.agroall.gessica.estoque.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.estoque.dataobjects.ProdutoInsumo;
import com.agroall.gessica.repositories.Repository;

public class ProdutoInsumoRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	@SuppressWarnings("hiding")
	public <ProdutoInsumo> ProdutoInsumo insert_(ProdutoInsumo produtoInsumo) {
		mongo.insert(produtoInsumo);
		return produtoInsumo;
	}

	@Override
	@SuppressWarnings("hiding")
	public <ProdutoInsumo> ProdutoInsumo update_(ProdutoInsumo produtoInsumo) {
		mongo.save(produtoInsumo);
		return produtoInsumo;
	}

	@Override
	@SuppressWarnings("hiding")
	public <ProdutoInsumo> void delete_(ProdutoInsumo produtoInsumo) {
		mongo.remove(produtoInsumo);
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <ProdutoInsumo> ProdutoInsumo findById_(Object id) {
		com.agroall.gessica.estoque.dataobjects.ProdutoInsumo result = mongo.findById(id, com.agroall.gessica.estoque.dataobjects.ProdutoInsumo.class);
		return (ProdutoInsumo) result;
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <ProdutoInsumo> Collection<ProdutoInsumo> listAll_() {
		List<com.agroall.gessica.estoque.dataobjects.ProdutoInsumo> result = mongo.findAll(com.agroall.gessica.estoque.dataobjects.ProdutoInsumo.class);
		return (Collection<ProdutoInsumo>) result;
	}

}
