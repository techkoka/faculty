package com.bellinfo.faculty.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.faculty.model.FacultyRegistration;
import com.bellinfo.faculty.service.FacultyServiceImpl;

@RequestMapping(value="/fac")
@Controller
public class FacultyController {
	
	@Autowired
	FacultyServiceImpl facultyServiceImpl;

	@RequestMapping(method=RequestMethod.GET)
	public String getFaculty(Model model){
		FacultyRegistration fr = new FacultyRegistration();
		model.addAttribute("facReg", fr);
		return "faculty-reg";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String saveFaculty(
			@Valid @ModelAttribute("facReg") FacultyRegistration facReg, 
			BindingResult result, Model model){
		if(result.hasErrors()){
			return "faculty-reg";
		}
		int id = facultyServiceImpl.saveFaculty(facReg);
		model.addAttribute("facId", id);
		return "success";		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listFacultyDetails(Model model){
		List<FacultyRegistration> facList = facultyServiceImpl.listFacultyDetails();
		model.addAttribute("facList", facList);
		return "fac-list";		
	}
	
	
}




