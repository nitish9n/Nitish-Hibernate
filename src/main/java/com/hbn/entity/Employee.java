package com.hbn.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;


@Entity 
public class Employee {
	
	
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)     
	private int id;
	private String name, gender;
	private int salary;
	
	
	@OneToOne(cascade = CascadeType.ALL)  // cascade all operation
//	@JoinColumn(name = "add_id")      // it will change foreign key name
	private Address address;         // dependency
	
	public Employee() {
		super();
		
//		System.out.println(" No arg constructor");
		}

	public Employee( String name, String gender, int salary, Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}

	
	
	

}
