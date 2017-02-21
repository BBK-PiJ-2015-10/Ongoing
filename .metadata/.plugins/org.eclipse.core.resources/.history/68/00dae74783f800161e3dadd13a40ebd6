package com.onetoone.unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ScriptDriver {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudent_name("Alejandro Palacios");
		
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("44-02032898070");
		studentDetail.setStudent(student);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentDetail);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		

	}

}
