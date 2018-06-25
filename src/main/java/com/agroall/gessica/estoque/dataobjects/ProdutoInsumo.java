package com.agroall.gessica.estoque.dataobjects;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.agroall.gessica.dataobjects.aspects.Persistent;

@Document(collection = "insumos")
public class ProdutoInsumo extends com.agroall.gessica.dataobjects.ProdutoInsumo implements Persistent<String> {
	
	@Id private String id;
	private Double custoUnitario;
	
	private Fornecedor fornecedor;
	private Collection<ItemCompra> itens;
	private ProdutoEstoque estoque;
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
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
	
	public Collection<ItemCompra> getItens() {
		return itens;
	}
	
	public void setItens(Collection<ItemCompra> itens) {
		this.itens = itens;
	}
	
	public void addItemCompra(ItemCompra itemCompa) {
		if(this.itens == null) { this.itens = factoryColletionItemCompra(); }
		this.addItemCompra(itemCompa);
	}
	
	protected Collection<ItemCompra> factoryColletionItemCompra() {
		return new HashSet<ItemCompra>();
	}
	
	public ProdutoEstoque getEstoque() {
		return estoque;
	}
	
	public void setEstoque(ProdutoEstoque estoque) {
		this.estoque = estoque;
		if(this.estoque == null) return;
		this.estoque.setCodigo(getCodigo());
		this.estoque.setDescricao(getDescricao());
	}
	
}
