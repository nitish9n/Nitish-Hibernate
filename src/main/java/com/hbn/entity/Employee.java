package com.hbn.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
public class Employee {
	
	
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)     
	private int id;
	private String name, gender;
	private int salary;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private List<Address> address;        
	
	

}
