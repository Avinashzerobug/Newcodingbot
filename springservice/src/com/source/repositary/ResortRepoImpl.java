package com.source.repositary;

import org.springframework.stereotype.Component;

import com.source.dto.ResortDTO;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean savingTheResortData(ResortDTO dto) {
		System.out.println("Creating the Resort  Repositary:");
		System.out.println(dto);
		return false;
	}

}
