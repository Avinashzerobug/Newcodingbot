package com.source.DTO;

import lombok.Data;

@Data
public class FamilyDTO {

	private String  fatherName;
	private String  motherName;
	private String  brotherName;
	private String  location;
	private int     noOfMembers;
	private String grandFatherName;
	private String grandMotherName;
	private String location2;
	private String cousin;
	private int    noOfCousin;
	
	public FamilyDTO()
	{
		System.out.println("Creating the FamilyDTO");
	}
	
}
