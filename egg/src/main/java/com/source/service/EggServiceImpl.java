package com.source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.dto.EggDTO;
import com.source.repositary.EggRepositary;

@Service
public class EggServiceImpl implements EggService {

	@Autowired
	private EggRepositary eggRepositary;
	
	public EggServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Ruuning the servie impl :"+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Running validating the egg service");
		boolean saved = this.eggRepositary.save(dto);
		System.out.println("saved in service:"+saved);
		return true;
	}

}
