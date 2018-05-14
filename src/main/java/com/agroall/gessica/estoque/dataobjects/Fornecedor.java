package com.agroall.gessica.estoque.dataobjects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "fornecedores")
public class Fornecedor extends com.agroall.gessica.dataobjects.Fornecedor implements Persistent<String> {
	
	@Id private String id;
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	
}
