package com.base;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Transient;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;

/*
 * This is an example using annotations
 */

//Tells hibernate that it is a class to persist into a database
@Entity
@Table(name="STUDENT_INFORMATION")
public class StudentInfo {
	
	//This is to specify the primary key
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pNo;
	
	//This annotation is to change the default name of the table column
	//Transient is to ignore that field completely
	//@Transient
	@Column(name="FULL_NAME",nullable=false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date birthdate;

	public int getPno() {
		return pNo;
	}

	public void setPno(int pNo) {
		this.pNo = pNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	
	
	


	
	
	

}
