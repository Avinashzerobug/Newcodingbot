package com.source.service;

import org.springframework.context.annotation.Bean;

import com.source.dto.BakeryDTO;


public interface BakeryInterface {

	
	boolean validateAndSave(BakeryDTO bakeryDTO);
	
}
