package com.manytoone.onedirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;

/*
 * This is an example of many-to-one on studentAddress;
 */

//Tells hibernate that it is a class to persist into a database
@Entity
@Table(name="STUDENT")
public class Student {
	
	//This is to specify the primary key
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int student_id;
	
	//This annotation is to change the default name of the table column
	private String student_name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private StudentAddress studentAddress;
	
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

	public StudentAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	
	
	

}
