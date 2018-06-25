package com.agroall.gessica.estoque.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.ProdutoEstoque;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ProdutoEstoqueService extends ServiceImpl<ProdutoEstoque> {
	
	@Override
	public ProdutoEstoque factoryNewDataObject() {
		return new ProdutoEstoque();
	}
	
	@Override
	public ProdutoEstoque insert(ProdutoEstoque dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public ProdutoEstoque update(ProdutoEstoque dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public void delete(ProdutoEstoque dataObject) {
		disableOperation(dataObject);
	}
	
	@Override
	public ProdutoEstoque findById(Object id) {
		disableOperation(null);
		return null;
	}
	
	@Override
	public Collection<ProdutoEstoque> listAll() {
		disableOperation(null);
		return null;
	}
	
}
