package com.gontuseries.hellocontroller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

///*

@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	//The response status is to send an appropriate status quote.
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e){

		System.out.println("Null pointer exception has occured: " +e);
		return "NullPointerException";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e){
		
		System.out.println("IO Exception exception has occured: " +e);
		return "IOException";
		
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e){
		
		System.out.println("Exception has occured: " +e.getMessage());
		return "Exception";
		
	}
	
	
}

//*/
