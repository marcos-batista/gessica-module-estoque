package com.agroall.gessica.estoque.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ItemCompra implements Persistent {
	
	private Integer id;
	private int quantidadeProdutos;
	private Double precoItem;
	
	private ProdutoInsumo produto;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}
	
	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}
	
	public Double getPrecoItem() {
		return precoItem;
	}
	
	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}
	
	public ProdutoInsumo getProduto() {
		return produto;
	}
	
	public void setProduto(ProdutoInsumo produto) {
		this.produto = produto;
	}
	
}
