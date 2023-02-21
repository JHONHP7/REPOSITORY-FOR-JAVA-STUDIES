package entities;

import java.sql.Date;

public class Order {
	//MODIFICADORES DE ACESSO, OU SEJA, PRIVATE SÓ 
	//PODE SER ACESSADO PELA MESMA CLASSE E QUANDO 
	//ESTÁ SEM NADA SÓ PODE SER ACESSADO PELO MESMO PACOTE
	private Date date;
	private Products products;
	
	public Order(Date date, Products products) {
		super();
		this.date = date;
		this.products = products;
		this.products.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
	
	
}
