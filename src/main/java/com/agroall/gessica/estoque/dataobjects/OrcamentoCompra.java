package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "orcamentoscompra")
public class OrcamentoCompra extends Compra implements Persistent<String> {
	
	@Id private String id;
	private Double precoCalculado;
	
	private Collection<ItemOrcamentoCompra> itens;
	
	public OrcamentoCompra() {
		this.itens = factoryCollectionItemOrcamentoCompra();
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Double getPrecoCalculado() {
		return precoCalculado;
	}
	
	public void setPrecoCalculado(Double precoCalculado) {}
	
	protected void calculatePreco() {
		this.precoCalculado = 0d;
		for (ItemOrcamentoCompra itemOrcamentoCompra : this.itens) {
			this.precoCalculado += itemOrcamentoCompra.getPrecoCalculado();
		}
	}
	
	public Collection<ItemOrcamentoCompra> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrcamentoCompra> itens) {
		this.itens = itens;
	}
	
	public void addItemOrcamentoCompra(ItemOrcamentoCompra itemOrcamentoCompra) {
		if(this.itens == null) { this.itens = factoryCollectionItemOrcamentoCompra(); }
		this.itens.add(itemOrcamentoCompra);
		calculatePreco();
	}
	
	protected Collection<ItemOrcamentoCompra> factoryCollectionItemOrcamentoCompra() {
		return new HashSet<ItemOrcamentoCompra>();
	}
	
}
