package com.source.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.source.dto.MissileDTO;
import com.source.repositary.MissileRepo;

@Component
public class MissileServiceImpl implements MissileSerivice {

	@Autowired
	private Validator validator;
	private MissileRepo repo;
	
	
	@Autowired
	public MissileServiceImpl(MissileRepo repo) {
		super();
		this.repo = repo;
	}



	@Override
	public boolean validatingTheMissile(MissileDTO dto) {
       System.out.println("Initializing the data and saving");
       System.out.println(dto);
       
       Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);
       
       if(!violation.isEmpty())
       {
    	   System.out.println("THere are ssome violation fix it bro");
    	   violation.forEach(v->System.err.println(v.getMessage()));
    	   return false;
       }
       else
       {
    	   System.out.println("Data is valid it can be save");
    	   boolean saved = this.repo.savingMissileRepo(dto);
    	   System.out.println("Saving the Missile:"+saved);
    	   return saved;
       }
	
	}

}
