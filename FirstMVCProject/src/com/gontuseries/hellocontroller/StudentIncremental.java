package com.gontuseries.hellocontroller;

import java.util.Date;
import java.util.ArrayList;

public class StudentIncremental extends Student  {
	
	private long studentMobile;
	
	private Date studentDOB;
	
	private ArrayList<String> studentSkills;

	public StudentIncremental(){
		super();
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
	
	
	


	
	

	

}
