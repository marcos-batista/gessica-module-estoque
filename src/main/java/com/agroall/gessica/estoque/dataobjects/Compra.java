package com.agroall.gessica.estoque.dataobjects;

import java.util.Calendar;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class Compra implements Persistent {
	
	private Integer id;
	private Calendar data;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
}
