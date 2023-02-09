package com.source.dto;

import lombok.Data;

@Data
public class BakeryDTO {

	private String bakeryName;
	private String bakeryOwnerName;
	private String bakeryOwnerWifeName;
	private String bakeryOwnerMarried;
	private String bakeryFamous;
	private int    since;

	
	public BakeryDTO()
	{
		System.out.println("Created BakeryDtO");
	}
	
}
