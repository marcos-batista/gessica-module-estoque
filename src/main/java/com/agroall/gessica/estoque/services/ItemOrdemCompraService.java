package com.agroall.gessica.estoque.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.agroall.gessica.estoque.dataobjects.ItemOrdemCompra;
import com.agroall.gessica.services.ServiceImpl;

@Service
public class ItemOrdemCompraService extends ServiceImpl<ItemOrdemCompra> {
	
	@Override
	public ItemOrdemCompra factoryNewDataObject() {
		return new ItemOrdemCompra();
	}
	
	@Override
	public ItemOrdemCompra insert(ItemOrdemCompra dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public ItemOrdemCompra update(ItemOrdemCompra dataObject) {
		disableOperation(dataObject);
		return null;
	}
	
	@Override
	public void delete(ItemOrdemCompra dataObject) {
		disableOperation(dataObject);
	}
	
	@Override
	public ItemOrdemCompra findById(Object id) {
		disableOperation(null);
		return null;
	}
	
	@Override
	public Collection<ItemOrdemCompra> listAll() {
		disableOperation(null);
		return null;
	}
	
}
