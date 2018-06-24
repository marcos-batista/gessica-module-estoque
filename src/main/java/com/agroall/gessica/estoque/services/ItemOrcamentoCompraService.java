package com.agroall.gessica.estoque.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.ItemOrcamentoCompra;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ItemOrcamentoCompraService extends ServiceImpl<ItemOrcamentoCompra> {
	
	@Override
	public ItemOrcamentoCompra factoryNewDataObject() {
		return new ItemOrcamentoCompra();
	}
	
	@Override
	public ItemOrcamentoCompra insert(ItemOrcamentoCompra dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public ItemOrcamentoCompra update(ItemOrcamentoCompra dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public void delete(ItemOrcamentoCompra dataObject) {
		disableOperation(dataObject);
	}
	
	@Override
	public ItemOrcamentoCompra findById(Object id) {
		disableOperation(null);
		return null;
	}
	
	@Override
	public Collection<ItemOrcamentoCompra> listAll() {
		disableOperation(null);
		return null;
	}
	
}
