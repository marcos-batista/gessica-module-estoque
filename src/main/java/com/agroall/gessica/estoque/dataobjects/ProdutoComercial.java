package com.agroall.gessica.estoque.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ProdutoComercial extends com.agroall.gessica.dataobjects.ProdutoComercial implements Persistent {
	
	private Integer id;
	
	private ProdutoInsumo produtoInsumo;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public ProdutoInsumo getProdutoInsumo() {
		return produtoInsumo;
	}
	
	public void setProdutoInsumo(ProdutoInsumo produtoInsumo) {
		this.produtoInsumo = produtoInsumo;
	}
	
}
