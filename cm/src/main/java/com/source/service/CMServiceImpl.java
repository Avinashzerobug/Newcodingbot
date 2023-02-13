package com.source.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.source.dto.CMDTO;

@Service
public class CMServiceImpl implements CmService {

	
	
	
	public CMServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName());
		System.out.println("Running the Service");
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto) {
		// TODO Auto-generated method stub
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations = validator.validate(cmdto);
		if(constraintViolations!=null && !constraintViolations.isEmpty())
		{
			System.err.println("constraintViolations exist,return constraintViolations");
			return constraintViolations;
		}
		else
		{
			System.out.println("constraintViolations does not exist,data is good");
			return Collections.emptySet();
		}
		
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
