package com.manytoone.onedirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ScriptDriver {

	public static void main(String[] args) {
		
		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress_detail("London, UK");
		
		Student student1 = new Student();
		student1.setStudent_name("Alejandro Palacios");
		student1.setStudentAddress(studentAddress);
		
		Student student2 = new Student();
		student2.setStudent_name("Raphael Raphael");
		student2.setStudentAddress(studentAddress);
				
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student1);
		session.save(student2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		

	}

}
