package com.source.runner;

import java.time.LocalDateTime;

import com.source.dto.TerroristDTO;
import com.source.service.TerroristSeriveImpl;
import com.source.service.TerroristService;

public class TerroristRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TerroristDTO dto = new TerroristDTO();
		dto.setName("Osama Bin Laden");
		dto.setAge(55);
		dto.setCountry("Afghanistan");
		dto.setAlive(false);
	   dto.setOrganization("Alqida");
	   dto.setPrison(false);
	   dto.setSpecialization("Killing the innocent people");
	   dto.setCreatedAt(LocalDateTime.now());
	   dto.setUpdatedAt(LocalDateTime.now());
	   dto.setCreatedBy("Avinash assassin");
	   dto.setUpdatedBy("Avinash Only");
		System.out.println(dto);
		
		TerroristService service = new TerroristSeriveImpl();
		service.validatingAndSaving(dto);
	}

}
