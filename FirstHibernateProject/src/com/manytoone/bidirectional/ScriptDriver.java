package com.manytoone.bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class ScriptDriver {

	public static void main(String[] args) {
		
		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress_detail("Birmingham, UK");
		
		Student student1 = new Student();
		student1.setStudent_name("Otero");
		student1.setStudentAddress(studentAddress);
		
		Student student2 = new Student();
		student2.setStudent_name("Raphael");
		student2.setStudentAddress(studentAddress);
		
		studentAddress.getStudents().add(student1);
		studentAddress.getStudents().add(student2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentAddress);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		/*
		
		Student student1 = new Student();
		student1.setStudent_name("Tontolone Palacios");
		
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("44-02032898070");
		
		studentDetail.setStudent(student1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(studentDetail);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		*/
		
		/*
		
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
		
		
		*/

	}

}
