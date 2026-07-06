package com.hbn.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateConfig {
	
	// we will create a separate method for the sessionFactory
	
	 public static SessionFactory getSessionFactory() {
		 
		 // java based configuration
		 Properties properties = new Properties();      //  Property is a legacy class of collection
		 
		 properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");    // it can be ignored, now useless
		 properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/mydb");
		 properties.put(Environment.JAKARTA_JDBC_USER, "root");
		 properties.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
		 properties.put(Environment.HBM2DDL_AUTO, "create");
		 properties.put(Environment.SHOW_SQL, "true");
		 properties.put(Environment.FORMAT_SQL, "true");
		
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
		 
		 Metadata meta = new MetadataSources(ssr).addAnnotatedClass(com.hbn.entity.Employee.class).getMetadataBuilder().build();
		 
		 return meta.buildSessionFactory();
		 
	}

}
