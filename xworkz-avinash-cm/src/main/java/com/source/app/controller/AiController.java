package com.source.app.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.app.dto.AiWorld;
import com.source.app.service.AiService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class AiController {

	@Autowired
	private AiService service;

	public AiController() {
		super();
		// TODO Auto-generated constructor stub
		log.info(this.getClass().getSimpleName());
	}
	
	@PostMapping("ai")
	private String onAi(Model model,AiWorld aiWorld)
	{
		log.info("Running the method in post:"+aiWorld);
		Set<ConstraintViolation<AiWorld>> violations = service.validateAndSave(aiWorld);
		if(violations.isEmpty())
		{
			log.info("No violations in dto");
			return "AISuccess";	
		}
		model.addAttribute("dto",aiWorld);
		
		return "AI";
		
	}
	
}
