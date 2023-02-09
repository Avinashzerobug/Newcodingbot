package com.source.repositary;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.source.dto.BakeryDTO;

@Repository
public class BakeryRepositaryImpl implements BakeryRepositary {

	public BakeryRepositaryImpl() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName());
	}

	
	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		// TODO Auto-generated method stub
		System.out.println("Running the Bakery Repositary");
		return false;
	}

}
