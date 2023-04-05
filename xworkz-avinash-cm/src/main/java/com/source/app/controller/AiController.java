package com.source.app.controller;


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
	
	
	@GetMapping("searchByUserIdAndPassWord")
	public String onfindByUserIdPassword(@RequestParam(required = false ) String userId,@RequestParam(required = false ) String password,@RequestParam(required = false ) Integer loginCount, Model model) {
	 
	//	List<AiWorld> dto2  = this.service.findByUserIdies(userId, loginCount, password);
		  AiWorld dto = this.service.findByUserId(userId, password, loginCount);
			
			if(dto!=null) {
				model.addAttribute("userID",dto.getUserId());
				model.addAttribute("password",dto.getPassword());
				return "LogInSuccess";
			}else {
				model.addAttribute("message1", "Data not found");
				return "Login";					
	}

	}
	
	
}




	
	
	
	
	
	
	
	

