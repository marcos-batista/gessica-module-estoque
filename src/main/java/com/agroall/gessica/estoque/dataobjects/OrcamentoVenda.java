package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "orcamentosvenda")
public class OrcamentoVenda extends Venda implements Persistent<String> {
	
	@Id private String id;
	private Collection<ItemOrcamentoVenda> itens;
	
	public OrcamentoVenda() {
		this.itens = factoryCollectionItemOrcamentoVenda();
	}
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	public Collection<ItemOrcamentoVenda> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrcamentoVenda> itens) {
		this.itens = itens;
	}
	
	public void addItemOrcamentoVenda(ItemOrcamentoVenda itemOrcamentoVenda) {
		if(this.itens == null) { this.itens = factoryCollectionItemOrcamentoVenda(); }
		this.itens.add(itemOrcamentoVenda);
	}
	
	protected Collection<ItemOrcamentoVenda> factoryCollectionItemOrcamentoVenda() {
		return new HashSet<ItemOrcamentoVenda>();
	}
	
}
