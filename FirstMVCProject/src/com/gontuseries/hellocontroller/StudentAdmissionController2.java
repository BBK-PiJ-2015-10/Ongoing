package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import java.util.Date;

import java.text.SimpleDateFormat;
import javax.validation.Valid;

@Controller
public class StudentAdmissionController2 {

	//This is for databinding customization
	@InitBinder
	public void initBinder(WebDataBinder binder){	
		
		//In this one I am not binding the mobile number
		//binder.setDisallowedFields(new String[]{"studentMobile"});
		
		//In this one I am creating a new date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class,"studentName",new StudentNameEditor());
		
	}
	
	
	@RequestMapping(value="/admissionForm7.html",method=RequestMethod.GET)
	public ModelAndView getAdmission7(){
		ModelAndView model7 = new ModelAndView("AdmissionForm7");
		return model7;
	}
	
	
	//Example of a model attribute allocation on a matter
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","University of London - Birkbeck");
	}
		

	
	//BindingResult is to catch error on binding
	//Without the @Valid annotation, spring will completely ignore the size annotation.
	@RequestMapping(value="/submitAdmissionForm7.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm7(@Valid@ModelAttribute("student7") StudentIncrementalWithAddress student6, BindingResult result){
		
		if (result.hasErrors()){
			
			ModelAndView model7 = new ModelAndView("AdmissionForm7");
			return model7;
			
		}
		
		ModelAndView model7 = new ModelAndView("AdmissionSuccess7");
		return model7;
		
	}
	
	
	

	
}
