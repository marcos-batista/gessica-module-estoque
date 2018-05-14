package com.agroall.gessica.estoque.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.estoque.dataobjects.ProdutoInsumo;
import com.agroall.gessica.repositories.Repository;

public interface ProdutoInsumoRepository extends MongoRepository<ProdutoInsumo, String>, Repository {
	
}
