package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.PathVariable;
import java.util.Map;

/*
 * This is an example of a multiaction controller class
 */
@Controller
@RequestMapping("/greet")
public class HelloController  {

		//This is called a request handling matter
		@RequestMapping("/welcome")
		public ModelAndView helloWorld(){
			
			ModelAndView model = new ModelAndView("HelloPage");
			model.addObject("msg","hello world");
			return model;
		}
		
		@RequestMapping("/hi")
		public ModelAndView hiWorld(){
			
			ModelAndView model = new ModelAndView("HelloPage");
			model.addObject("msg","hi world");
			return model;
		}
		
		//This is an example with a path annotation to pass a variable from the URL
		@RequestMapping("welcome/{countryName}/{userName}")
		public ModelAndView helloWorldWithUser(@PathVariable("userName") String name,
											   @PathVariable("countryName") String country){
			
			ModelAndView model = new ModelAndView("HelloPage");
			model.addObject("msg","hello " +name +" you should move from " +country +" to ENGLAND");
			return model;
		}
		
		@RequestMapping("bienvenue/{countryName}/{userName}")
		public ModelAndView helloWorldWithUser(@PathVariable Map<String,String> pathVars){
			
			String name = pathVars.get("userName");
			String country = pathVars.get("countryName");
			
			ModelAndView model = new ModelAndView("HelloPage");
			model.addObject("msg","hello mapper elements " +name +" you should move from " +country +" to ENGLAND");
			//model.addObject("msg","hello " +pathVars.get("userName") +" you should move from " +pathVars.get("countryName") +" to ENGLAND");
			return model;
		}
		
		
	
	/*
	 * Benefits vs non-annotation:
	 * - Not tied up to a particular extension implemenation.
	 * - No need to have a bean registered in the spring-distpatcher-servlet.
	 */

}
