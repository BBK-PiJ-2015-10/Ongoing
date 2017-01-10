package com.gontuseries.hellocontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	
	/*
	 * When the submittin form
	 * Spring MVC will run setAsText function of this class
	 * before performing data binding task for the studentName field of student
	 * object
	 */
	
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		
		if(studentName.contains("Mr.") || studentName.contains("Ms.")){
			
			setValue(studentName);
			
		} else {
			
			studentName = "Ms. "+studentName;
			
			setValue(studentName);
		}
		
		
		
		
	}

}
