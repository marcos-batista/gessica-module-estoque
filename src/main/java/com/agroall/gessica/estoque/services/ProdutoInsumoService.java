package com.agroall.gessica.estoque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.estoque.dataobjects.ProdutoInsumo;
import com.agroall.gessica.estoque.repositories.ProdutoInsumoRepository;
import com.agroall.gessica.repositories.Repository;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ProdutoInsumoService extends ServiceImpl<ProdutoInsumo> {
	
	@Autowired private ProdutoInsumoRepository repository;
	
	@Override
	public ProdutoInsumo factoryNewDataObject() {
		return new ProdutoInsumo();
	}
	
	@Override
	protected Repository getRepository() {
		return this.repository;
	}
	
	@Override
	protected Repository factoryRepository() {
		return this.repository;
	}
	
	protected String resolveCodigoProduto(ProdutoInsumo produtoInsumo) {
		return produtoInsumo.getId();
	}
	
	@Override
	protected void validateBeforeInsertOrUpdate(ProdutoInsumo produtoInsumo) {
		super.validateBeforeInsertOrUpdate(produtoInsumo);
		if(produtoInsumo.getDescricao() == null || produtoInsumo.getDescricao().trim().isEmpty()) {
			throw new RuntimeException("Descrição do produto não foi informada!");
		}
		ProdutoEstoque estoque = produtoInsumo.getEstoque();
		if(estoque == null) { throw new RuntimeException("Estoque do produto não foi informado!"); }
	}
	
	public void creditarEstoque(ProdutoInsumo produtoInsumo, int quantidade) {
		produtoInsumo = findById(produtoInsumo.getId());
		ProdutoEstoque produtoEstoque = produtoInsumo.getEstoque();
		produtoEstoque.creditar(quantidade);
		update(produtoInsumo);
	}
	
	public void debitarEstoque(ProdutoInsumo produtoInsumo, int quantidade) {
		produtoInsumo = findById(produtoInsumo.getId());
		ProdutoEstoque produtoEstoque = produtoInsumo.getEstoque();
		produtoEstoque.debitar(quantidade);
		update(produtoInsumo);
	}
	
}
