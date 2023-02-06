package com.source.DTO;

import lombok.Data;

@Data
public class EducationDTO {

	  private String name;
	  private String schoolName;
	  private double schoolMarks;
	  private String collegeName;
	  private double collegMarks;
      private String schoolLocation;
      private String CollegeLocation;
      private String favoriteTeacher;
      private boolean ranker;
      private int noOfFailSubjec;
      
      
      
	public EducationDTO() {
		super();
		System.out.println("Running the EducationDTO");
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "EducationDTO [name=" + name + ", schoolName=" + schoolName + ", schoolMarks=" + schoolMarks
				+ ", collegeName=" + collegeName + ", collegMarks=" + collegMarks + ", schoolLocation=" + schoolLocation
				+ ", CollegeLocation=" + CollegeLocation + ", favoriteTeacher=" + favoriteTeacher + ", ranker=" + ranker
				+ ", noOfFailSubjec=" + noOfFailSubjec + "]";
	}
	
	
	
	
	
	
	
	
	
}
