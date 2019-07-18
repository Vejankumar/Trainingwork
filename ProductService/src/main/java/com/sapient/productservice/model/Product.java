package com.sapient.productservice.model;

import java.io.Serializable;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "Product")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@XmlElement
	@Column(name = "id")
	private int id;
	

	@XmlElement
	@Column(name = "name")
	private String name;
	
	@NotNull
	@XmlElement
	@Column(name = "price")
	private double price;
	
	public Product(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
