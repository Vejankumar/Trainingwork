package com.sapient.productservice.dao;

import java.util.List;

import com.sapient.productservice.model.Product;


public interface ProductServiceDAO {
	public int saveProduct(Product product);

    public List<Product> listAll();

    public Product findById(int id);

    public void deleteProduct(int id);
    
    public void update(int id,Product product);
}
