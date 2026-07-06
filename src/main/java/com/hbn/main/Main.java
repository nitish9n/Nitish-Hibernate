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
//		Employee e2 = new Employee( "Khushi", "Female", 49000);
//		Employee e3 = new Employee( "Muskan", "Female", 48000);
//		Employee e4 = new Employee( "Twinkle", "Female", 47000);
//		Employee e5 = new Employee( "Divya", "Female", 46000);
//		Employee e6 = new Employee( "Sony", "Female", 45000);
//		Employee e7 = new Employee( "Sarita", "Female", 45000);
		
		
//		Employee e0 = new Employee();

	
		// hibernate.cfg.xml is the default file name(no need to mention it), otherwise we need to mention configuration file name
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");   
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
//		session.persist(e7);
	
		Employee emp = session.find(Employee.class, 7);  // get method is deprecated now
		
		System.out.println(emp);
		
//		session.load(e0, 2);
//		System.out.println(e0);;
		
		tx.commit();
	
	
		
	}

}
