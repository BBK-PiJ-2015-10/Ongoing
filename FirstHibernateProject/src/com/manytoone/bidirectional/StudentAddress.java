package com.manytoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Set;
import java.util.HashSet;

/*
 * This is an example of one to many on StudentAddress
 */

@Entity
@Table(name="STUDENTADDRESS")
public class StudentAddress {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int address_id;
	
	private String address_detail;
	
	//The class with the mappedBy annotation is the not owning side
	@OneToMany(cascade=CascadeType.ALL,mappedBy="studentAddress")
	private Set<Student> students = new HashSet<>();

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
	
	

}
