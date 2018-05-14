package com.agroall.gessica.estoque.dataobjects;

public class ItemCompra {
	
	private int quantidadeProdutos;
	private Double precoItem;
	
	private ProdutoInsumo produto;
	
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
