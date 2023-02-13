package com.source.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.dto.EggDTO;
import com.source.service.EggService;


@Controller
@RequestMapping("/egg")
public class EggController {

	@Autowired
	private EggService eggService;
	
	
	public EggController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the Egg Controller");
	}

	@PostMapping
	public String onOrder(EggDTO dto)
	{
		System.out.println("Running the on Order:"+dto);
		boolean saved = this.eggService.validateAndSave(dto);
		System.out.println("saved in egg controller:"+saved);		
		return "index";
	}
	

	
	
}
