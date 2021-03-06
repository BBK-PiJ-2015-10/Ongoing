package com.gontuseries.hellocontroller;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target( {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String listOfValidHobbies() default "Dancing|Painting";
	
	String message() default "Please provide a valid hobby value "
			+ "choose among: Swimming,Running,Open Source,German,Dutch";
		
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}
