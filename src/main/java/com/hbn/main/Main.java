package com.hbn.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee( "Khushi", "Female", 49000);
		Employee e1 = new Employee( "Nitish", "Male", 50000);
	
		// hibernate.cfg.xml is the default file name(no need to mention it), otherwise we need to mention configuration file name
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");   
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
	
		session.persist(e);
		session.persist(e1);
		
		tx.commit();
	
	
	}

}
