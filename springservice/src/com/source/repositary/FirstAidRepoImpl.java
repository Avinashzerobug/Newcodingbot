package com.source.repositary;

import org.springframework.stereotype.Component;

import com.source.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean savingFirstAidRepo(FirstAidDTO dto) {
		System.out.println("Running the saving data through firstaid repo");
		System.out.println(dto);
		return true;
		// TODO Auto-generated method stub
		
	}

}
