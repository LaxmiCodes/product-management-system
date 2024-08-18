package com.product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.product;
import com.product.service.Productservice;

import jakarta.persistence.Query;

@Repository
public class Productdao {
	
	@Autowired
	SessionFactory sf;
	
	
	
	public product addProduct(product product) {
		
	Session session	=sf.openSession();
		product pp=session.get(product.class, product.getId());
		session.beginTransaction().commit();
		
	session.save(product);
		return product;
	}



	public product delateProduct(int id) {
		Session session=sf.openSession();
		product pp=session.get(product.class, id);
		session.delete(pp);
		session.beginTransaction().commit();
		return pp;

	}



	public product getProductById(int id) {
	Session session=sf.openSession();
	product pp=session.get(product.class, id);
	
		return pp;
	}



	public product updateProduct(int id,product pro) {
	Session session=sf.openSession();
	product pp=session.get(product.class, pro.getId());
	if(pp!=null) {
		pp.setId(pro.getId());
		pp.setName(pro.getName());
		pp.setPrice(pro.getPrice());
		pp.setQty(pro.getQty());
		session.update(pp);
		session.beginTransaction().commit();
	}
	
		
		
		return pro;
	}



	public List<product> getallProduct() {
		
		List<product>pp=null;
		
		Session session=sf.openSession();
		org.hibernate.query.Query<product> query=session.createQuery("FROM product",product.class);
		pp=query.list();
		
		return pp;
	}



	


	
	}

