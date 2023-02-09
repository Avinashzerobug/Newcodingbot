package com.source.repositary;

import org.springframework.context.annotation.Bean;

import com.source.dto.BakeryDTO;


public interface BakeryRepositary {

	
	boolean save(BakeryDTO bakeryDTO);
}
