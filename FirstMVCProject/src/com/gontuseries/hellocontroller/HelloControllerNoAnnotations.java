package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloControllerNoAnnotations extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","Hi User, welcome to the first Spring MVC Application");
		return modelandview;
		
		/*
		 * 1. Modify web.xml file
		 * 2. Create spring-dispatcher-servlet.xml
		 * 3. Create the HelloController.java class (A controller).
		 * 4. Creat the HelloPage.jsp file (A view)
		 * 
		 */
		
	}

}
