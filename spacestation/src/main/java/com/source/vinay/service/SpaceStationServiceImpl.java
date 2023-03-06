package com.source.vinay.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.vinay.Entity.SpaceStationEntity;
import com.source.vinay.dto.SpaceStationDTO;
import com.source.vinay.repositary.SpaceStationRepo;





@Service
public class SpaceStationServiceImpl implements SpaceStationService {

	@Autowired
	private SpaceStationRepo repo;

	public SpaceStationServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Creating the space service impl");
	}

	@Override
	public SpaceStationDTO findById(int id) {
		// TODO Auto-generated method stub
		if(id>0)
		{
			SpaceStationEntity entity = this.repo.findBy(id);
			if(entity!=null)
			{
				System.out.println("Entity SpaceStation is founded by id:"+id);
				SpaceStationDTO dto = new SpaceStationDTO();
				dto.setName(entity.getName());            //to convert the data entity to dto using the set method
				dto.setNoOfStation(entity.getNoOfStation());
				dto.setAstranuatNames(entity.getAstranuatNames());
				dto.setCost(entity.getCost());
				dto.setCountries(entity.getCountries());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return SpaceStationService.super.findById(id);
	}

	@Override
	public Set<ConstraintViolation<SpaceStationDTO>> validateAndSave(SpaceStationDTO dto) {
		// TODO Auto-generated method stub
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory(); //its use for validate the data
		Validator validator2 = validator.getValidator();
		Set<ConstraintViolation<SpaceStationDTO>> violation = validator2.validate(dto); //passing the ref(dto) to which class should be validate
		if(violation!=null && !violation.isEmpty())
		{
			System.out.println("Something error in dto:"+dto);
		    return violation;	
		}
		
		else
		{
			SpaceStationEntity entity = new SpaceStationEntity();
			entity.setAstranuatNames(dto.getAstranuatNames());
			entity.setCost(dto.getCost());
			entity.setCountries(dto.getCountries());
			entity.setName(dto.getName());
			entity.setNoOfStation(dto.getNoOfStation());
			entity.setId(dto.getId());
			boolean saved = this.repo.saved(entity);
			System.out.println("Space DTO saved in service:"+saved);
			System.out.println("There id no violation in DTO");
			
			return Collections.emptySet();
		}
	}

	
	@Override
	public List<SpaceStationDTO> findByCountries(String countries) {
		// TODO Auto-generated method stub
		System.out.println("Running the findByCountries in service "+ countries);

		if(countries != null && !countries.isEmpty())
		{
			System.out.println("Countries is valid ....... Calling the repository");
			List<SpaceStationEntity> entities = this.repo.findByCountries(countries);
			List<SpaceStationDTO> listDTO = new ArrayList<SpaceStationDTO>();
			for(SpaceStationEntity entity: entities) 
			{
				SpaceStationDTO dto = new SpaceStationDTO();
				dto.setAstranuatNames(entity.getAstranuatNames());
				dto.setCost(entity.getCost());
				dto.setCountries(entity.getCountries());
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setNoOfStation(entity.getNoOfStation());
			    listDTO.add(dto);
			}
			
			System.out.println("Size of the data:"+ listDTO.size());
			System.out.println("size of the entities:"+entities.size());
			return listDTO;
			
		}
		
		
		
		else
		{
			System.out.println("countries are invlid in this list check it");
		}
		
		return SpaceStationService.super.findByCountries(countries);
	}
	
	

	@Override
	public Set<ConstraintViolation<SpaceStationDTO>> validateAndUpdate(SpaceStationDTO dto) {
		// TODO Auto-generated method stub
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<SpaceStationDTO>> violations = validator.validate(dto);
		if(violations!=null && !violations.isEmpty())
		{
			System.err.println("Violation in DTO:"+dto);
			return violations;
		}
		else
		{
			System.out.println("no violation found dto can be saved and update");
			SpaceStationEntity entity = new SpaceStationEntity();
			entity.setAstranuatNames(dto.getAstranuatNames());
			entity.setCost(dto.getCost());
			entity.setCountries(dto.getCountries());
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setNoOfStation(dto.getNoOfStation());
			
			boolean saved = this.repo.update(entity);
			System.out.println("Entity data is saved:"+saved);
			return Collections.emptySet();
					
		}
		
	}

	@Override
	public boolean deleteSpace(int id) {
		// TODO Auto-generated method stub
	
		boolean  delete =repo.deleteSpace(id);
		return true;
		
	}
	
	
	
	
	
	
	
	
	
}
