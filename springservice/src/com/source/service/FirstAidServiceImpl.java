package com.source.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.source.dto.FirstAidDTO;
import com.source.repositary.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstService {

	@Autowired
	private Validator validator;

	private FirstAidRepo repo;
	
	
	
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo repo) {
		super();
		this.repo = repo;
		System.out.println("Created service constructor by passing repositary");
	}



	@Override
	public boolean validatingTheData(FirstAidDTO dto)
	{ 
		System.out.println("Running the validating the data and saving");
		System.out.println("DTO"+dto);
		
		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(dto);
		
 		if(!violations.isEmpty())
		{
			System.out.println("There are some violations error try to fix it");
			violations.forEach(v->System.err.println(v.getMessage()));
			return false;
		}
		else
		{
			System.out.println("Data is valid it can be save");
			boolean saved = this.repo.savingFirstAidRepo(dto);
			System.out.println("Saving the first Aid:"+saved);
			return saved;
		}
		
		
	}

}
