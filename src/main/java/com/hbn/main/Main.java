package com.hbn.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.hibernate.query.SelectionQuery;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Address;
import com.hbn.entity.Employee;

public class Main {
	
	public static void saveRecord(Session session) {  // separate method for save record
		
		Transaction tx = session.beginTransaction();

		
//		Initialization by using setter
		
		Address a1 = new Address();
		a1.setCity("Noida");
		a1.setState("UP");
		
		Employee e1 = new Employee();
		e1.setName("Khushi");
		e1.setGender("Female");
		e1.setSalary(25000);
		e1.setAddress(a1);
		
		a1.setEmployee(e1);
		
		
//		Initialization by using constructors
		
//		Address a2 = new Address("Buxar", "Bihar", e2);
//		Employee e2 = new Employee("Khushi", "Female", 30000, a2);
		
		session.persist(e1);
//		session.persist(a1);
		
		tx.commit();

		
	}

	public static void main(String[] args) {
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
//		saveRecord(session); 
		
//		Employee employee = session.find(Employee.class, 2);
//		System.out.println(employee);
		
		Address address = session.find(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getEmployee());
		
		// deletion
//		Employee ee = session.find(Employee.class, 2);
//		session.remove(ee);				
		
//		tx.commit();
		
		
	
		
		
	}

}
