package com.sapient.productservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sapient.productservice.dao.ProductServiceDAO;
import com.sapient.productservice.model.Product;

@Service(value="productservice")
public class ProductserviceImpl implements Productservice {
	
	@Autowired( required = true)
	@Qualifier(value="HybernateDAOImpl")
    private ProductServiceDAO productServiceDAO;

    public ProductserviceImpl(@Qualifier(value="HybernateDAOImpl")ProductServiceDAO productServiceDAO){
        this.productServiceDAO = productServiceDAO;
    }
    
    @Transactional
	public int saveProduct(Product product) {
		System.out.println("Inside the save employee method of Employee service class ....");
        return productServiceDAO.saveProduct(product);
		
	}
    
    @Transactional
	public List<Product> fetchAllProduct() {
		 return productServiceDAO.listAll();
		
	}
    
    @Transactional
	public Product findById(int id) {
		System.out.println("Inside the findby employee method of Employee service class ....");
        return productServiceDAO.findById(id);
		
	}
    
    @Transactional
	public void deleteProduct(int id) {
		System.out.println("Inside the deleteEmployee employee method of Employee service class ....");
		productServiceDAO.deleteProduct(id);
		
	}

    @Transactional
	public void update(int id, Product product) {
		System.out.println("Inside the Update employee method of Employee service class ....");
		productServiceDAO.update(id,product);
		
	}

}
