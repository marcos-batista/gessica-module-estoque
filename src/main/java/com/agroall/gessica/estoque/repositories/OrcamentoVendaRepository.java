package com.agroall.gessica.estoque.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.estoque.dataobjects.OrcamentoVenda;
import com.agroall.gessica.repositories.Repository;

public interface OrcamentoVendaRepository extends MongoRepository<OrcamentoVenda, String>, Repository {
	
}
