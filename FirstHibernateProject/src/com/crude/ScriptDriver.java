package com.crude;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ScriptDriver {

	public static void main(String[] args) {
		
		
		//Need to complete videos 15,16,17
		
		Student student1 = new Student();
		student1.setStudent_name("Alexander Palacios");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//How to create the record
		
		session.save(student1);
		
		//Student tempStudent = new Student();
		
		//How to retrieve a record from a SQL database  (READ)
		
		//tempStudent = session.get(Student.class,1);
		
		//System.out.println("Student Object having student name as " +tempStudent.getStudent_name());
		
		//Now I am changing the name of that record (UPDATE)
		
		//tempStudent.setStudent_name("The tontolone Alexander Palacios");
		//session.update(tempStudent);
		
		//To delete the record
		
		//session.delete(tempStudent);
		
		/*
		 * A couple of other methods that exists in hibernate are:
		 * - persist
		 * - load
		 * - refresh
		 * - flush
		 * - saveupdate
		 */
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
		
		
		

	}

}
