package com.source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.source.dto.BakeryDTO;
import com.source.repositary.BakeryRepositary;

@Service
public class BakeryServiceImpl implements BakeryInterface {

	@Autowired
	private BakeryRepositary bakeryRapositary;
	
	
	public BakeryServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName());
	}

	
	@Override
	public boolean validateAndSave(BakeryDTO bakeryDTO) {
		// TODO Auto-generated method stub
		
		System.out.println("Running the validate and saving the Bakery service:"+bakeryDTO);
		boolean saved = this.bakeryRapositary.save(bakeryDTO);
		System.out.println("Saved in repositary check it :"+saved);
		return false;
	}

}
