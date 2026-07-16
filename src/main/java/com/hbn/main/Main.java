package com.hbn.main;

import java.util.ArrayList;
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
	
	public static void saveRecord(Session session) {  
		
		Transaction tx = session.beginTransaction();

		
//		Initialization by using setter
		
		Address a1 = new Address();
		a1.setCity("Noida");
		a1.setState("UP");
		
		Address a2 = new Address();
		a2.setCity("Gurgaon");
		a2.setState("HR");
		
		Address a3 = new Address();
		a3.setCity("Gzb");
		a3.setState("UP");
		
		ArrayList<Address> listOfAddress = new ArrayList<>();
		
		listOfAddress.add(a1);
		listOfAddress.add(a2);
		listOfAddress.add(a3);
		
		Employee e1 = new Employee();
		e1.setName("Muskan");
		e1.setGender("Female");
		e1.setSalary(25000);
		e1.setAddress(listOfAddress);
		
		a1.setEmployee(e1);
		a2.setEmployee(e1);
		a3.setEmployee(e1);
		
	
		session.persist(e1);
		
		tx.commit();

		
	}

	public static void main(String[] args) {
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		saveRecord(session); 
		
//		Employee e = session.find(Employee.class, 1);
//		System.out.println(e);
		
		Address a = session.find(Address.class, 2);
		System.out.println(a);
		System.out.println(a.getEmployee());
		
		
					
		
//		tx.commit();
		
		
	
		
		
	}

}
