package com.source.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.beachDTO.BeachDTO;



@Component
@RequestMapping("/beach")
public class BeachController {

	

	
	@PostMapping
	public String onCasino(BeachDTO beachDTO,Model model)
	{
		System.out.println("Running the on casino"+beachDTO);
		model.addAttribute(beachDTO.getName());
		model.addAttribute(beachDTO.getEntryFee());
		return "BeachSuccess.jsp";
}
}