package com.agroall.gessica.estoque.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ProdutoEstoque extends com.agroall.gessica.dataobjects.ProdutoEstoque implements Persistent {
	
	private Integer id;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
}
