package com.agroall.gessica.estoque.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.estoque.dataobjects.ProdutoComercial;
import com.agroall.gessica.repositories.Repository;

public interface ProdutoComercialRepository extends MongoRepository<ProdutoComercial, String>, Repository {
	
}
