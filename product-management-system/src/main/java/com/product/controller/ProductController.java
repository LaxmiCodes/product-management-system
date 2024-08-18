package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.product;
import com.product.service.Productservice;

@RestController
@CrossOrigin(origins = "")
public class ProductController {
	
	@Autowired
Productservice service;
	
	
	@PostMapping("/addproduct")
	public product addProduct(@RequestBody product product) {
		return service.addProduct(product);
		
	}
	@DeleteMapping("/deleete-product/{id}")
	public product delateProduct(@PathVariable int id ) {
		return service.delateProduct(id);
		
		   
	}
	
	
	@GetMapping("/get-by-id/{id}")
    public product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

	
	
	@PutMapping("/update-product/{id}")
    public product updateProduct(@PathVariable int id, @RequestBody product product) {
        return service.updateProduct(id, product);
    }

	@GetMapping("/getallProduct")
	public List<product>getallProduct()
	{
		return service.getallProduct();
		
	}

	

}
