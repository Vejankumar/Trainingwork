package com.pack.springmvc.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@XmlRootElement
public class Employee {
	@NotNull(message = "Please enter id")
	private int id;
	@NotNull(message = "Please enter name")
	private String name;
	 @Range(min = 1, max = 150) 
	private int age;
	@NotNull(message = "Please enter salary")
	private double salary;
	
	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name= name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee()
	{
		this.id = 73;
		this.name= "Vejan";
		this.age = 21;
		this.salary = 67000;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
