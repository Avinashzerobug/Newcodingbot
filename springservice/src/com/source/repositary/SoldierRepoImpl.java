package com.source.repositary;

import com.source.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {

	@Override
	public boolean savingSoldierRepo(SoldierDTO dto) {
		System.out.println("running and saving");
		System.out.println("DTO"+dto);
		return false;
		// TODO Auto-generated method stub
		
	}

}
