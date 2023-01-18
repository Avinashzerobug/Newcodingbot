package com.source.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.source.dto.SoldierDTO;
import com.source.repositary.SoldierRepo;

public class SoldierServiceImpl  implements SoldierService {

	
   private SoldierRepo soldierRepo;
	
	public void setSoldierRepo(SoldierRepo soldierRepo)
	{
		this.soldierRepo = soldierRepo;
	}
   
	@Override
	public boolean validatingSaving(SoldierDTO dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation = validator.validate(dto);
		
		if(!violation.isEmpty())
		{
			System.out.println("There are validation error in your proram idiot....");
			violation.forEach(v->System.out.println("Violating message "+v.getMessage()));
			return false;
		}
	
		
		else
		{
			System.out.println("Data is valid...");
			boolean saved = soldierRepo.savingSoldierRepo(dto);
			System.out.println("DTO is saved using repo:"+saved);
			return saved;
		}
		
	}

}
