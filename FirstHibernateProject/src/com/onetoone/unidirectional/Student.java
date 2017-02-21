package com.onetoone.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

/*
 * This is an example of one to one unidirectional
 */


@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
