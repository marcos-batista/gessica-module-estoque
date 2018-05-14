package com.agroall.gessica.estoque.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.agroall.gessica.estoque.dataobjects.OrcamentoVenda;
import com.agroall.gessica.repositories.Repository;

public class OrcamentoVendaRepositoryImpl implements Repository {
	
	@Autowired private MongoTemplate mongo;
	
	@Override
	@SuppressWarnings("hiding")
	public <OrcamentoVenda> OrcamentoVenda insert_(OrcamentoVenda orcamentoVenda) {
		mongo.insert(orcamentoVenda);
		return orcamentoVenda;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <OrcamentoVenda> OrcamentoVenda update_(OrcamentoVenda orcamentoVenda) {
		mongo.save(orcamentoVenda);
		return orcamentoVenda;
	}
	
	@Override
	@SuppressWarnings("hiding")
	public <OrcamentoVenda> void delete_(OrcamentoVenda orcamentoVenda) {
		mongo.remove(orcamentoVenda);
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <OrcamentoVenda> OrcamentoVenda findById_(Object id) {
		com.agroall.gessica.estoque.dataobjects.OrcamentoVenda result = mongo.findById(id, com.agroall.gessica.estoque.dataobjects.OrcamentoVenda.class);
		return (OrcamentoVenda) result;
	}

	@Override
	@SuppressWarnings({ "hiding", "unchecked" })
	public <OrcamentoVenda> Collection<OrcamentoVenda> listAll_() {
		List<com.agroall.gessica.estoque.dataobjects.OrcamentoVenda> result = mongo.findAll(com.agroall.gessica.estoque.dataobjects.OrcamentoVenda.class);
		return (Collection<OrcamentoVenda>) result;
	}
	
}
