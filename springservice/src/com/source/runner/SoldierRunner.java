package com.source.runner;

import com.source.dto.SoldierDTO;
import com.source.repositary.SoldierRepo;
import com.source.repositary.SoldierRepoImpl;
import com.source.service.SoldierService;
import com.source.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoldierDTO dto = new SoldierDTO ("Sahana","India",505,"Soldier +","one Thousand",007);
		SoldierServiceImpl service= new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validatingSaving(dto);
		
	}

}
