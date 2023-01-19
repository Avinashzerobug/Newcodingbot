package com.source.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.source.dto.ResortDTO;
import com.source.repositary.ResortRepo;

@Component
public class ResortServiceImpl implements ResortSerivce {

	@Autowired
	private Validator validator;
	private ResortRepo repo;
	

	@Autowired
	public ResortServiceImpl(ResortRepo repo) {
		super();
		this.repo = repo;
	}

	
	@Override
	public boolean validatingTheResort(ResortDTO dto) {
		System.out.println("Intitializing the data");
		System.out.println(dto);
		
		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);
		
		if(!violation.isEmpty())
		{
			System.out.println("SOmething violation is going check it bro");
			violation.forEach(v->System.out.println(v.getMessage()));
			return false;
		}
		else
		{
			System.out.println("Data is valid it can be saved");
			boolean saved = this.repo.savingTheResortData(dto);
			System.out.println("Saving the Resort:"+saved);
			return saved;
		}
		
		
	}

}
