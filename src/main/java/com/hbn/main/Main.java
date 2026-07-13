package com.hbn.main;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee( "Nitish", "Male", 50000);
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		// to get all the records from Employee
//		Query q = session.createQuery("from Employee", Employee.class);
//		List l = q.list();
//		List l = q.getResultList(); // list() and getResultList() both work as same
//		System.out.println(l);
		
		// Partial records
//		Query q = session.createQuery("SELECT gender FROM Employee ", String.class);
//		List l = q.list();
//		System.out.println(l);
		
		// WHERE
		Query q = session.createQuery("FROM Employee WHERE id > 2", Employee.class);
		List l = q.list();
		System.out.println(l);
				
		// pagination
//		Query q = session.createQuery("from Employee", Employee.class);
//		q.setFirstResult(2);
//		q.setMaxResults(3);
//		List l = q.list();
//		System.out.println(l); 
		
		// Update
//		MutationQuery q = session.createMutationQuery("UPDATE Employee SET name = :n Where id = :i");
//		q.setParameter("n", "Twinkle");
//		q.setParameter("i", 4);
//		q.executeUpdate();
//		
		//delete
//		MutationQuery q = session.createMutationQuery("DELETE from Employee Where id = :i");
//		q.setParameter("i", 7);
//		q.executeUpdate();
		
		// aggregate methods
//		Query q = session.createQuery("SELECT max(name) from Employee");
//		List l = q.list();
//		System.out.println(l);
		
		// insert data
//		MutationQuery q = session.createMutationQuery("INSERT INTO Employee (id, name, gender, salary) VALUES (:i, :n, :g, :s)");
//		q.setParameter("i", 7);
//		q.setParameter("n", "Siksha");
//		q.setParameter("g", "Female");
//		q.setParameter("s", 25000);
//		q.executeUpdate();
//
//		
//		tx.commit();
	
		
		
	}

}
