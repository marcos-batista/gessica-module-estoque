package com.agroall.gessica.estoque.dataobjects;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class ProdutoInsumo extends com.agroall.gessica.dataobjects.ProdutoInsumo implements Persistent {
	
	private Integer id;
	private Double custoUnitario;
	
	private Fornecedor fornecedor;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getCustoUnitario() {
		return custoUnitario;
	}
	
	public void setCustoUnitario(Double custoUnitario) {
		this.custoUnitario = custoUnitario;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
