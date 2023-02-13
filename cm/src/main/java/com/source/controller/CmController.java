package com.source.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.dto.CMDTO;

import com.source.service.CmService;

@Controller
@RequestMapping("/cm")
public class CmController {

	@Autowired
	private CmService cmService;

	public CmController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Running the controller");
	}
	
	
	@PostMapping
	public String onCm(CMDTO cmdto,Model model)
	{
		System.out.println("Running the Oncm"+ cmdto);
		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmService.validateAndSave(cmdto);
		if(!constraintViolations.isEmpty())
		{
			System.out.println("Validation failed,display error message");
			constraintViolations.forEach((cv)->System.err.println(cv.getMessage()));
		}
		else
		{
			System.out.println("Validation success , display success message");
		}
		
		return "CM";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
