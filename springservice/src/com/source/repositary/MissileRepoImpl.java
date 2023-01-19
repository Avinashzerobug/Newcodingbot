package com.source.repositary;

import org.springframework.stereotype.Component;

import com.source.dto.MissileDTO;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Component
public class MissileRepoImpl implements MissileRepo
{

	@Override
	public boolean savingMissileRepo(MissileDTO dto) {
		System.out.println("Creating and the saving the data through Missile Repo");
		System.out.println(dto);
		return false;
	}

}
