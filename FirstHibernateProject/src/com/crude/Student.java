package com.crude;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/*
 * This is an example of many-to-many on studentCertification;
 */

//Tells hibernate that it is a class to persist into a database
@Entity
@Table(name="STUDENT")
public class Student {
	
	//This is to specify the primary key
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int student_id;
	
	private String student_name;
		
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	

}
