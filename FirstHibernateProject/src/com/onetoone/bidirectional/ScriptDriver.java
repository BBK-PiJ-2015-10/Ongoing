package com.onetoone.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ScriptDriver {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudent_name("Alexander Palacios");
		
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("44-018098070");
		studentDetail.setStudent(student);
		
		student.setStudentDetail(studentDetail);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		

	}

}
