package com.hbn.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee(1, "Nitish", "Male", 56000);
	
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
	
		session.persist(e);
		
		tx.commit();
	
	
	}

}
