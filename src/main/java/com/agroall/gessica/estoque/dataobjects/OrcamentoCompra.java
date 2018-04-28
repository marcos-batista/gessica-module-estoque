package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;

public class OrcamentoCompra extends Compra {
	
	private Collection<ItemOrcamentoCompra> itens;
	
	public Collection<ItemOrcamentoCompra> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrcamentoCompra> itens) {
		this.itens = itens;
	}
	
}
