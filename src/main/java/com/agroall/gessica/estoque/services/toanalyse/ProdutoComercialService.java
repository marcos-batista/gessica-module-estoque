package com.agroall.gessica.estoque.services.toanalyse;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.agroall.gessica.dataobjects.ProdutoComercial;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ProdutoComercialService extends ServiceImpl<ProdutoComercial> {
	
	@Override
	public ProdutoComercial factoryNewDataObject() {
		return new ProdutoComercial();
	}
	
	@Override
	public ProdutoComercial insert(ProdutoComercial produtoComercial) {
		disableOperation(produtoComercial);
		return null;
	}
	
	@Override
	public ProdutoComercial update(ProdutoComercial produtoComercial) {
		disableOperation(produtoComercial);
		return null;
	}
	
	@Override
	public void delete(ProdutoComercial produtoComercial) {
		disableOperation(produtoComercial);
	}
	
	@Override
	public ProdutoComercial findById(Object id) {
		disableOperation(null);
		return null;
	}
	
	@Override
	public Collection<ProdutoComercial> listAll() {
		disableOperation(null);
		return null;
	}
	
}
