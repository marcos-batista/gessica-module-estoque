package com.agroall.gessica.estoque.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.estoque.dataobjects.OrcamentoCompra;
import com.agroall.gessica.repositories.Repository;

public interface OrcamentoCompraRepository extends MongoRepository<OrcamentoCompra, String>, Repository {
	
}
