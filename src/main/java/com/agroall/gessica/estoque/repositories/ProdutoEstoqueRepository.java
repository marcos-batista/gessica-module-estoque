package com.agroall.gessica.estoque.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.dataobjects.ProdutoEstoque;
import com.agroall.gessica.repositories.Repository;

public interface ProdutoEstoqueRepository extends MongoRepository<ProdutoEstoque, String>, Repository {
	
}
