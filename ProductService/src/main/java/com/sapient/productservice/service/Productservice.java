package com.sapient.productservice.service;

import java.util.List;

import com.sapient.productservice.model.Product;


public interface Productservice {
	 public int saveProduct(Product product);

	    public List<Product> fetchAllProduct();

	    public Product findById(int id);

	    public void deleteProduct(int id);
	    
	    public void update(int id,Product product);
}
