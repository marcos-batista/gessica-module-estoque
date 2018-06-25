package com.agroall.gessica.estoque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.estoque.dataobjects.ProdutoInsumo;
import com.agroall.gessica.estoque.services.ProdutoInsumoService;
import com.agroall.gessica.services.Service;

@RestController
@CrossOrigin
@RequestMapping("/produto")
public class ProdutoInsumoDataResource extends DataObjectResourceControllerImpl<ProdutoInsumo> {
	
	@Autowired private ProdutoInsumoService service;
	
	@Override
	protected Service<ProdutoInsumo> getService() {
		return this.service;	
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ProdutoInsumo doGet() {
		return super.doGet();
	}
	
	@Override
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ProdutoInsumo doPost(@RequestBody ProdutoInsumo produtoInsumo) {
		produtoInsumo.setId(null);
		return super.doPost(produtoInsumo);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ProdutoInsumo doGet(@PathVariable(value = "id") String id) {
		return super.doGet(id);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ProdutoInsumo doPut(@PathVariable(value = "id") String id, @RequestBody ProdutoInsumo produtoInsumo) {
		produtoInsumo.setId(id);
		return super.doPut(id, produtoInsumo);
	}
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public ProdutoInsumo doDelete(ProdutoInsumo produtoInsumo) {
		return super.doDelete(produtoInsumo);
	}
	
	@RequestMapping(value = "/{id}/estoque/credito/{quantidade}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ProdutoInsumo doCreditarEstoque(@PathVariable(value = "id") String id, @PathVariable(value = "quantidade") String quantidade, @RequestBody ProdutoInsumo produtoInsumo) {
		produtoInsumo.setId(id);
		creditarEstoque(produtoInsumo, quantidade);
		return super.doGet(produtoInsumo.getId());
	}
	
	protected void creditarEstoque(ProdutoInsumo produtoInsumo, String quantidade) {
		Integer quantidadeAsNumber = Integer.parseInt(quantidade);
		this.service.creditarEstoque(produtoInsumo, quantidadeAsNumber);
	}
	
	@RequestMapping(value = "/{id}/estoque/debito/{quantidade}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ProdutoInsumo doDebitarEstoque(@PathVariable(value = "id") String id, @PathVariable(value = "quantidade") String quantidade, @RequestBody ProdutoInsumo produtoInsumo) {
		produtoInsumo.setId(id);
		debitarEstoque(produtoInsumo, quantidade);
		return super.doGet(produtoInsumo.getId());
	}
	
	protected void debitarEstoque(ProdutoInsumo produtoInsumo, String quantidade) {
		Integer quantidadeAsNumber = Integer.parseInt(quantidade);
		this.service.debitarEstoque(produtoInsumo, quantidadeAsNumber);
	}
	
}
