package com.agroall.gessica.estoque.dataobjects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "produtoscomerciais")
public class ProdutoComercial extends com.agroall.gessica.dataobjects.ProdutoComercial implements Persistent<String> {
	
	@Id private String id;
	
	private ProdutoInsumo produtoInsumo;
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public ProdutoInsumo getProdutoInsumo() {
		return produtoInsumo;
	}
	
	public void setProdutoInsumo(ProdutoInsumo produtoInsumo) {
		this.produtoInsumo = produtoInsumo;
	}
	
}
