package com.agroall.gessica.estoque.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agroall.gessica.estoque.dataobjects.Fornecedor;
import com.agroall.gessica.repositories.Repository;

public interface FornecedorRepository extends MongoRepository<Fornecedor, String>, Repository {
	
}
