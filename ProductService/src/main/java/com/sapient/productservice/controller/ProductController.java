package com.sapient.productservice.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

import com.sapient.productservice.model.Product;
import com.sapient.productservice.service.Productservice;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/api/v1/products/")
@PropertySource("classpath:documentation.properties")
public class ProductController {
	
	@Autowired
	Productservice productservice;
	 
	@GetMapping(value="/", produces = {APPLICATION_JSON_VALUE , APPLICATION_XML_VALUE})
	@ApiOperation(value="fetch all employees", notes = "API to fetch all the employees")
	public  List<Product> listAll()
	{
		System.out.println("Heleo");
		//List<Product> products = Arrays.asList(new Product(),new Product(),new Product());
		return productservice.fetchAllProduct();
	}
	
	@GetMapping(value="/{id}", produces = {APPLICATION_JSON_VALUE , APPLICATION_XML_VALUE})
	public Product findById(@ApiParam(value = "${ProductionController.FetchByID") @PathVariable("id") int id)
	{
		return productservice.findById(id);
	}
	
	@PostMapping(value = "/" , consumes = {APPLICATION_JSON_VALUE , APPLICATION_XML_VALUE})
	public String saveProduct( @RequestBody Product product)
	{
		System.out.println("Came inside the save product");
 		productservice.saveProduct(product);
 		return "SUCESS";
	}
	
	@PutMapping(value = "/{id}" , consumes = {APPLICATION_JSON_VALUE , APPLICATION_XML_VALUE})
	public void updateProduct(@PathVariable int id,@RequestBody Product product)
	{
		System.out.println("Came inside the update product");
		product.setId(id);
		productservice.update(id,product);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		System.out.println("Came inside the delete product");
		productservice.deleteProduct(id);
	}
}
