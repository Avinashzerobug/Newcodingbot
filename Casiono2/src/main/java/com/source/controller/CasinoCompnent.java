package com.source.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.DTO.CasinoDTO;

@Component
@RequestMapping("/gambling")
public class CasinoCompnent {

	
	CasinoDTO casinoDTO;
	
	public CasinoCompnent() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Created component"+this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCasino(CasinoDTO casinoDTO,Model model)
	{
		System.out.println("Running the on casino"+casinoDTO);
		model.addAttribute(casinoDTO.getName());
		model.addAttribute(casinoDTO.getEntryFee());
		return "CasinoSuccess.jsp";
		  
	}
	
	
	
}

