package com.source.DTO;

import lombok.Data;

@Data
public class CasinoDTO {

	
	private String name;
	private String crusie;
	private Double entryFee;
	private boolean freeFood;
	
	
	public CasinoDTO() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Created Casino Using no arg const");
	}


	
	
	
}
