package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.ItemOrdemCompra;
import com.agroall.gessica.estoque.services.ItemOrdemCompraService;
import com.agroall.gessica.services.Service;

@RestController
@CrossOrigin
@RequestMapping("/compra/item")
public class ItemOrdemCompraDataResource extends DataObjectResourceControllerImpl<ItemOrdemCompra> {
	
	@Autowired private ItemOrdemCompraService service;
	
	@Override
	protected Service<ItemOrdemCompra> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ItemOrdemCompra doGet() {
		return super.doGet();
	}
	
}
