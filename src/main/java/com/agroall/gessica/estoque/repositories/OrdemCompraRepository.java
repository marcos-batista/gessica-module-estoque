package com.agroall.gessica.estoque.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.estoque.dataobjects.OrdemCompra;
import com.agroall.gessica.repositories.Repository;

public interface OrdemCompraRepository extends MongoRepository<OrdemCompra, String>, Repository {
	
}
