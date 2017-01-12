package com.gontuseries.hellocontroller;

import java.util.Date;
import java.util.ArrayList;
import javax.validation.constraints.Past;
import javax.validation.constraints.Max;

public class StudentIncremental extends Student  {
	
	//Also available is @Min, @NotNull @NotEmpty @Future for dates
	//@Max(2222)
	private long studentMobile;
	
	@Past
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
