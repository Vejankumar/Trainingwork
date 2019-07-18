package com.sapient.productservice.dao;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sapient.productservice.model.Product;

@Repository(value="ProductServiceDAO")
public class ProductServiceDAOImpl implements ProductServiceDAO{
	
	 @Autowired
	 private JdbcTemplate jdbcTemplate;


	 public ProductServiceDAOImpl(JdbcTemplate jdbcTemplate){
	        this.jdbcTemplate = jdbcTemplate;
	   }
	

	public int saveProduct(Product product) {
		System.out.println("Came inside the save method of MySQLEmployeeDAOImpl");
        jdbcTemplate.execute("insert into productservice values ('"+product.getId()+"','"+product.getName()+"','"+product.getPrice()+"')");
        return 1;
		
	}

	public List<Product> listAll() {
		List<Product> list=jdbcTemplate.query("select * from productservice",
			    (ResultSet rs,int rowNum)->
			    {
			    return 
			    		new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			   
			    });
			 return list;
		
	}

	public Product findById(int id) {
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from productservice where id= "+id);
        for(Map<String, Object> row : rows){
       	
        	Product product = new Product(id,(String)row.get("name"),(double)row.get("price"));
        
           return product;
         }

       return null;
		
	}

	public void deleteProduct(int id) {
		jdbcTemplate.execute("delete from productservice where id="+id);
		
	}

	public void update(int id, Product product) {
		String updateQuery = "update productservice set id=?,name = ?,price=? where id = ?";
		jdbcTemplate.update(updateQuery, product.getId(),product.getName(),product.getPrice(), id);
		
	}

}
