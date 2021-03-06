package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmission(){
		
		ModelAndView model1 = new ModelAndView("AdmissionForm");
		return model1;
	}
	
	@RequestMapping(value="/admissionForm2.html",method=RequestMethod.GET)
	public ModelAndView getAdmission2(){
		
		ModelAndView model2 = new ModelAndView("AdmissionForm2");
		return model2;
	}
	
	@RequestMapping(value="/admissionForm3.html",method=RequestMethod.GET)
	public ModelAndView getAdmission3(){
		
		ModelAndView model3 = new ModelAndView("AdmissionForm3");
		return model3;
	}
	
	
	@RequestMapping(value="/admissionForm4.html",method=RequestMethod.GET)
	public ModelAndView getAdmission4(){
		
		ModelAndView model4 = new ModelAndView("AdmissionForm4");
		//model4.addObject("headerMessage","University of London");
		return model4;
	}
	
	
	@RequestMapping(value="/admissionForm5.html",method=RequestMethod.GET)
	public ModelAndView getAdmission5(){
		
		ModelAndView model5 = new ModelAndView("AdmissionForm5");
		//model5.addObject("headerMessage","University of Londonium");
		return model5;
	}
	
	@RequestMapping(value="/admissionForm6.html",method=RequestMethod.GET)
	public ModelAndView getAdmission6(){
		ModelAndView model6 = new ModelAndView("AdmissionForm6");
		return model6;
	}
	
	
	//Example of a model attribute allocation on a matter. This will be called by Spring before
	//calling any of the matters of this controller.
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","University of London - Birkbeck");
	}
		
	
	//This is a simple example with RequestParam
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar){
	
		String name = reqPar.get("studentName");
		String hobby = reqPar.get("studentHobby");
		
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		model1.addObject("message","Details submitted by you::Name " +name +", Hobby:" + hobby);
		return model1;
	}
	
	//This is an example creating the object inside
	@RequestMapping(value="/submitAdmissionForm2.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm2(@RequestParam Map<String,String> reqPar){
		
		Student student2 = new Student();
		student2.setStudentName(reqPar.get("studentName"));
		student2.setStudentHobby(reqPar.get("studentHobby"));
		
		
		ModelAndView model2 = new ModelAndView("AdmissionSuccess2");
		model2.addObject("headerMessage","University of London");
		model2.addObject("student2",student2);
		return model2;
		
	}
	
	/* This is an example with model attribute, it is critical that the names
	* of the jsp entry form match the field names of the class that we are using
	*/
	@RequestMapping(value="/submitAdmissionForm3.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm3(@ModelAttribute("student3") Student student3){
				
		ModelAndView model3 = new ModelAndView("AdmissionSuccess3");
		model3.addObject("headerMessage","University of London");
		return model3;
		
	}
	
	
	@RequestMapping(value="/submitAdmissionForm4.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm4(@ModelAttribute("student3") Student student3){
				
		ModelAndView model4 = new ModelAndView("AdmissionSuccess3");
		//model4.addObject("headerMessage","University of London");
		return model4;
		
	}
	
	@RequestMapping(value="/submitAdmissionForm5.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm5(@ModelAttribute("student5") StudentIncremental student5){
				
		ModelAndView model5 = new ModelAndView("AdmissionSuccess5");
		//model4.addObject("headerMessage","University of London");
		return model5;
		
	}
	
	//BindingResult is to catch error on binding
	@RequestMapping(value="/submitAdmissionForm6.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm6(@ModelAttribute("student6") StudentIncrementalWithAddress student6, BindingResult result){
		
		if (result.hasErrors()){
			
			ModelAndView model6 = new ModelAndView("AdmissionForm6");
			return model6;
			
		}
		
		ModelAndView model6 = new ModelAndView("AdmissionSuccess6");
		return model6;
		
	}
	
	
	
	/*
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm
	(@RequestParam(value="studentName",defaultValue="Bibio") String name,
	 @RequestParam(value="studentHobby",defaultValue="Chilling") String hobby){
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details submitted by you::Name " +name +", Hobby:" + hobby);
		return model;
	}
	*/
		
	//Moving into tutorial 11
	
}
