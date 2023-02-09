package com.source.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.dto.BakeryDTO;
import com.source.service.BakeryInterface;



@Controller
@RequestMapping("/Laddu")
public class BakeryController {

	@Autowired
	private BakeryInterface bakery;

	
	BakeryDTO bakeryDTO;

	public BakeryController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Created Controller:"+this.getClass().getSimpleName());
	}
	
     @PostMapping
	public String onBakery(BakeryDTO bakeryDTO,Model model)
	{	
		System.out.println("Running the Bakery:"+bakeryDTO);
		model.addAttribute(bakeryDTO.getBakeryName());
		model.addAttribute(bakeryDTO.getBakeryOwnerName());
		model.addAttribute(bakeryDTO.getBakeryOwnerWifeName());
		model.addAttribute(bakeryDTO.getBakeryOwnerMarried());
		model.addAttribute(bakeryDTO.getBakeryFamous());
		model.addAttribute(bakeryDTO.getSince());
		boolean saved = this.bakery.validateAndSave(bakeryDTO);
		System.out.println("Saved controller and service:"+ saved);
		return "BakerySuccess";
		
	}
	
}
