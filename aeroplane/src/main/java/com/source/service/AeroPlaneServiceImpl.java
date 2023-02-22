package com.source.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.dto.AeroPlaneDTO;
import com.source.entity.AeroPlaneEntity;
import com.source.repositary.Aerorepositary;

import io.quarkus.arc.runtime.BeanContainer.Factory;

@Service
public class AeroPlaneServiceImpl implements AeroPlaneService{

	@Autowired
	private Aerorepositary aerorepositary;
	
	
	public AeroPlaneServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the Aero Service ");
	}

	
	@Override
	public AeroPlaneDTO findById(int id) {
		// TODO Auto-generated method stub
		if(id>0)
		{
			AeroPlaneEntity entity = this.aerorepositary.findBy(id);
			if(entity!=null)
			{
				System.out.println("Entity of aeroplane founded by id:"+id);
				AeroPlaneDTO dto = new AeroPlaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setCost(entity.getCost());
				dto.setCountry(entity.getCountry());
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setType(entity.getType());
				return dto;		
			}
		}
		return AeroPlaneService.super.findById(id);
	}
	
	
	
	
	
	
	
	@Override
	public Set<ConstraintViolation<AeroPlaneDTO>> validateAndSave(AeroPlaneDTO aeroPlaneDTO) {
		// TODO Auto-generated method stub
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator validator2 = validator.getValidator();
		 Set<ConstraintViolation<AeroPlaneDTO>> violation = validator2.validate(aeroPlaneDTO);
		 if(violation!=null && !violation.isEmpty())
		 {
			 System.out.println("something error in dto:"+aeroPlaneDTO);
			 return violation;
		 }
		 else
		 {
			 AeroPlaneEntity entity = new AeroPlaneEntity();
			 entity.setCompany(aeroPlaneDTO.getCompany());
			 entity.setCost(aeroPlaneDTO.getCost());	
			 entity.setCountry(aeroPlaneDTO.getCountry());
			 entity.setId(aeroPlaneDTO.getId());
			 entity.setName(aeroPlaneDTO.getName());
			 entity.setType(aeroPlaneDTO.getType());
			 boolean saved = this.aerorepositary.saving(entity);
			 System.out.println("Aero plane DTO saved in service:"+saved);
			 System.out.println("There is no violation in DTO :");
		 }
		    return Collections.emptySet();
	}

}
