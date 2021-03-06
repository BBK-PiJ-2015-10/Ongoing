package com.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ScriptDriver {

	public static void main(String[] args) {
		
		
		StudentInfo studentInfo1 = new StudentInfo();
		studentInfo1.setName("Ale Culon");
		studentInfo1.setBirthdate(new Date());
		//student.setRollNo(1);
		
		StudentInfo studentInfo2 = new StudentInfo();
		studentInfo2.setName("Ale Biruta");
		studentInfo2.setBirthdate(new Date());
		//student2.setRollNo(2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//When session is open, a database connection is open
		Session session = sessionFactory.openSession();
		//Begin Transaction is needed, since we are doing a CUD operation
		session.beginTransaction();
		
		session.save(studentInfo1);
		session.save(studentInfo2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
		

	}

}
