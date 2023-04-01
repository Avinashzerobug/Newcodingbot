package com.source.app.ajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.source.app.dto.AiWorld;
import com.source.app.service.AiService;

import lombok.extern.slf4j.Slf4j;

@EnableWebMvc
@RestController
@Slf4j
@RequestMapping
("/")
public class AjaxController {

	@Autowired
	private AiService aiService;

	public AjaxController() {
		log.info("" + this.getClass().getSimpleName());
	}

	@GetMapping(value = "/email/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onEmail(@PathVariable String email) {
		Long dbEmail = this.aiService.findByEmail(email);
		System.err.println(dbEmail);

		if (dbEmail == 0) {
			System.err.println("Running in equals condition");
			return "";
		} else {
			return "Email id exsist";
		}
	}

	@GetMapping(value = "/userId/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onUser(@PathVariable String userId) {
		Long dbUser = this.aiService.findByUser(userId);
		System.err.println(dbUser);

		if (dbUser == 0) {
			System.err.println("Running in equals condition");
			return "";

		} else {
			return "UserID exsist";
		}
	}

	@GetMapping(value = "/num/{num}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onMobile(@PathVariable Long num) {
		Long dbNumber = this.aiService.findByMobile(num);
		System.err.println(dbNumber);

		if (dbNumber == 0) {
			System.err.println("Running in equals condition");
			return "";

		} else {
			return "Mobile Number exsist";
		}
	}

	@GetMapping(value = "/dto", produces = MediaType.APPLICATION_JSON_VALUE)
	public AiWorld userDto() {
		AiWorld dto = new AiWorld();
		dto.setUserId("Avinash");
		dto.setEmail("avinashmullur123@gmail.com");
		dto.setNum(9110819083L);
		System.out.println(dto);
		return dto;
	}
	
}
