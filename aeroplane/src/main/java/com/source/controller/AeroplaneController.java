package com.source.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.source.dto.AeroPlaneDTO;
import com.source.service.AeroPlaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroPlaneService aeroPlaneService;

	private List<String> types = Arrays.asList("Bussiness", "Economy", "Premium", "Luxury");
	private List<String> countrys = Arrays.asList("INDIA", "RUSSIA", "UKRAINE", "JAPAN", "GERMANY", "USA", "FRANCE");

	public AeroplaneController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the controller using no arg constructor");
	}

	@GetMapping("/aero")
	public String onAeroPlane(Model model) {
		System.out.println("Running onaeroplane in get mappingF");
		/*List<String> types = Arrays.asList("Bussiness", "Economy", "Premium", "Luxury");
		List<String> countrys = Arrays.asList("INDIA", "RUSSIA", "UKRAINE", "JAPAN", "GERMANY", "USA", "FRANCE");
		model.addAttribute("types", types);
		model.addAttribute("countrys", countrys);*/
		System.out.println("Running onAeroplane Get method");
		List<String> types = Arrays.asList("Bussiness", "Economy", "Premium", "Luxury");
		List<String> countrys = Arrays.asList("INDIA", "RUSSIA", "UKRAINE", "JAPAN", "GERMANY", "USA", "FRANCE");
		model.addAttribute("types", types);
		model.addAttribute("countrys", countrys);
		return "AeroPlane";
	}

	@GetMapping("/search")
	public String onAero(@RequestParam int id, Model model) {
		System.out.println("Running the OnAero:");
		AeroPlaneDTO dto = this.aeroPlaneService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message","Data is not found enter proper id");
		}

		return "AeroSearch";

	}

	@PostMapping("/aero")
	public String onAeroPlane(Model model, AeroPlaneDTO dto) {
		System.out.println("onValantine method in post" + dto);
		Set<ConstraintViolation<AeroPlaneDTO>> violations = aeroPlaneService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violation are in dto");
			return "AeroPlaneSuccess";
		}
		model.addAttribute("countrys", countrys);
		model.addAttribute("types", types);
		model.addAttribute("errors",violations);
		model.addAttribute("dto",dto);
		System.out.println("errors are in the violations");
		return "AeroPlane";
	}

}
