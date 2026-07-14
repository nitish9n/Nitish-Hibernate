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

	public static void main(String[] args) {
		
//		Initialization by using setter
		
//		Address a1 = new Address();
//		a1.setCity("Noida");
//		a1.setState("UP");
//		
//		Employee e1 = new Employee();
//		e1.setName("Salini");
//		e1.setGender("Female");
//		e1.setSalary(25000);
//		e1.setAddress(a1);
		
		
//		Initialization by using constructors
		
		Address a2 = new Address("Buxar", "Bihar");
		Employee e2 = new Employee("Muskan", "Female", 25000, a2);
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		session.persist(e2);
		session.persist(a2);
		
		
		tx.commit();
	
		
		
	}

}
