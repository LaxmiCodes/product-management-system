package com.product.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.Productdao;
import com.product.entity.product;

@Service
public class Productservice {

	@Autowired
	Productdao dao;

	public product addProduct(product product) {
		
		return dao.addProduct(product);
	}

	

	public product delateProduct(int id) {
		
		return dao.delateProduct(id);
	}



	public product updateProduct(int id,product pro) {
		
		return dao.updateProduct(id, pro);
	}



	public product getProductById(int id) {
	
		return dao.getProductById(id);
	}



	public List<product> getallProduct() {
		
		return dao.getallProduct();
	}



	



	
	
	
	}
