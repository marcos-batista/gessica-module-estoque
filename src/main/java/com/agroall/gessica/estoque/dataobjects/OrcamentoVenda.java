package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

public class OrcamentoVenda extends Venda implements Persistent {
	
	private Integer id;

	private Collection<ItemOrcamentoVenda> itens;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Collection<ItemOrcamentoVenda> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrcamentoVenda> itens) {
		this.itens = itens;
	}
	
}
