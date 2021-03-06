package com.gontuseries.hellocontroller;

import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	
	//@Size(min=2, max=30, message="Please enter a value between 2 to 30 letters in the student hobby field.")
	@Size(min=3, max=30) @IsValidHobby(listOfValidHobbies="Swimming|Running|Open Source|German|Dutch")
	private String studentHobby;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	
	

}
