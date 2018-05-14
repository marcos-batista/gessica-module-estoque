package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "ordenscompra")
public class OrdemCompra extends Compra implements Persistent<String> {
	
	@Id private String id;
	private Collection<ItemOrdemCompra> itens;
	
	public OrdemCompra() {
		this.itens = factoryCollectionItemOrdemCompra();
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Collection<ItemOrdemCompra> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrdemCompra> itens) {
		this.itens = itens;
	}
	
	public void addItemOrcamentoCompra(ItemOrdemCompra itemOrcamentoCompra) {
		if(this.itens == null) { this.itens = factoryCollectionItemOrdemCompra(); }
		this.itens.add(itemOrcamentoCompra);
	}
	
	protected Collection<ItemOrdemCompra> factoryCollectionItemOrdemCompra() {
		return new HashSet<ItemOrdemCompra>();
	}
	
}
