package com.agroall.gessica.estoque.dataobjects;

public class ItemCompra {
	
	private int quantidadeProdutos;
	private Double precoItem;
	private Double precoCalculado;
	
	public ItemCompra() {
		this.quantidadeProdutos = 0;
		this.precoItem = 0d;
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
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {}
	
	protected void calculatePreco() {
		if(this.precoItem == null) { this.precoCalculado = null; return; }
		this.precoCalculado = (this.precoItem * this.quantidadeProdutos);
	}
	
}
