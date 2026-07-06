package com.hbn.main;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee( "Nitish", "Male", 50000);
		Employee e2 = new Employee( "Khushi", "Female", 49000);
		Employee e3 = new Employee( "Muskan", "Female", 48000);
		Employee e4 = new Employee( "Twinkle", "Female", 47000);
		Employee e5 = new Employee( "Divya", "Female", 46000);
		Employee e6 = new Employee( "Sony", "Female", 45000);

	
		// hibernate.cfg.xml is the default file name(no need to mention it), otherwise we need to mention configuration file name
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");   
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
	
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		session.persist(e4);
		session.persist(e5);
		session.persist(e6);
		
		tx.commit();
	
	
	}

}
