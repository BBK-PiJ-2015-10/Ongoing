package com.manytomany.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Script {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.setStudent_name("Alejandro Palacios");
		
		Student student2 = new Student();
		student2.setStudent_name("Rabbo Palacios");
		
		StudentCertification studentCertification1 = new StudentCertification();
		studentCertification1.setCertification_name("Core Java Certification");
		studentCertification1.getStudents().add(student1);
		
		StudentCertification studentCertification2 = new StudentCertification();
		studentCertification2.setCertification_name("Core Scala Certification");
		studentCertification2.getStudents().add(student2);
		
		student1.getStudentCertification().add(studentCertification1);
		student2.getStudentCertification().add(studentCertification2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentCertification1);
		session.save(studentCertification2);
		
		//session.save(student1);
		//session.save(student2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
		

	}

}
