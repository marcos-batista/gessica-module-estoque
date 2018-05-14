package com.agroall.gessica.estoque.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.repositories.Repository;

public class ProdutoEstoqueRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	@SuppressWarnings("hiding")
	public <ProdutoEstoque> ProdutoEstoque insert_(ProdutoEstoque produtoEstoque) {
		mongo.insert(produtoEstoque);
		return produtoEstoque;
	}

	@Override
	@SuppressWarnings("hiding")
	public <ProdutoEstoque> ProdutoEstoque update_(ProdutoEstoque produtoEstoque) {
		mongo.save(produtoEstoque);
		return produtoEstoque;
	}

	@Override
	@SuppressWarnings("hiding")
	public <ProdutoEstoque> void delete_(ProdutoEstoque produtoEstoque) {
		mongo.remove(produtoEstoque);
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <ProdutoEstoque> ProdutoEstoque findById_(Object id) {
		com.agroall.gessica.estoque.dataobjects.ProdutoEstoque result = mongo.findById(id, com.agroall.gessica.estoque.dataobjects.ProdutoEstoque.class);
		return (ProdutoEstoque) result;
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <ProdutoEstoque> Collection<ProdutoEstoque> listAll_() {
		List<com.agroall.gessica.estoque.dataobjects.ProdutoEstoque> result = mongo.findAll(com.agroall.gessica.estoque.dataobjects.ProdutoEstoque.class);
		return (Collection<ProdutoEstoque>) result;
	}

}
