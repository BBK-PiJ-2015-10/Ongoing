package com.gontuseries.hellocontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby,String> {

	@Override
	public void initialize(IsValidHobby isValidHobby) {	
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		
		if(studentHobby==null){
			return false;
		}
		
		if (studentHobby.matches("Swimming|Running|Open Source|German")){
			return true;
		} 
		else {
			return false;
		}
		
	
	}
	
	

}
