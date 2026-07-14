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
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee( "Nitish", "Male", 50000);
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		Query q = session.createNamedQuery("Employee.findIdById", Employee.class);
		
		q.setParameter("id", 2);
		List l = q.getResultList();
		System.out.println(l);
		
		System.out.println("--------------------------------------------------------------");
		
		Query q1 = session.createNamedQuery("Employee.findIdByGender", Employee.class);
		q1.setParameter("gender", "female");
		List l1 = q.getResultList();
		System.out.println(l1);
		
		
		
		tx.commit();
	
		
		
	}

}
