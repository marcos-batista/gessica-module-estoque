package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;

public class OrdemCompra extends Compra {
	
	private Collection<ItemOrdemCompra> itens;
	
	public Collection<ItemOrdemCompra> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemOrdemCompra> itens) {
		this.itens = itens;
	}
	
}
