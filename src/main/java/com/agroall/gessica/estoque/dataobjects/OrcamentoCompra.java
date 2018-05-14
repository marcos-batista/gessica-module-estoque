package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "orcamentoscompra")
public class OrcamentoCompra extends Compra implements Persistent<String> {
	
	@Id private String id;
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
	
	public Collection<ItemOrcamentoCompra> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrcamentoCompra> itens) {
		this.itens = itens;
	}
	
	public void addItemOrcamentoCompra(ItemOrcamentoCompra itemOrcamentoCompra) {
		if(this.itens == null) { this.itens = factoryCollectionItemOrcamentoCompra(); }
		this.itens.add(itemOrcamentoCompra);
	}
	
	protected Collection<ItemOrcamentoCompra> factoryCollectionItemOrcamentoCompra() {
		return new HashSet<ItemOrcamentoCompra>();
	}
	
}
