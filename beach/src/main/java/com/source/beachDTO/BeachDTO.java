package com.source.beachDTO;

import lombok.Data;

@Data
public class BeachDTO {

	
	  private String name;
	  private String place;
	  private Double entryFee;
	  private boolean freeBeer;
	  
	  
	  public BeachDTO()
	  {
		  System.out.println("Creating the BEACH DTO using the no arsgs constructor");
	  }
	  
	
}
