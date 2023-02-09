package com.source.service;

import com.source.dto.TheaterDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.TheaterRepositary;

public class TheaterServiceImpl implements TheaterService {

	TheaterRepositary repositary;
	
	
	public TheaterServiceImpl(TheaterRepositary repositary) {
		super();
		this.repositary = repositary;
	}


	@Override
	public boolean validateAndSaved(TheaterDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated {
	     boolean idType =false;
	     boolean nameType = false;
	     boolean brandType = false;
	     boolean seatsType = false;
	     
	     if(dto.getId()!=0 && dto.getId()>0)
	     {
	    	 System.out.println("its valid id number:"+dto.getId());
	    	 System.out.println(dto);
	    	 idType =true;
	    	 System.out.println("****************************************************************");
	     }
	     else
	     {
	    	 System.err.println("Custom exception started");
	    	 throw new CheckTheDataOnceAgainItsNotMatchingRequriements("*****Check the data its not valid id*****");
	     }
	     if(dto.getName()!=null && dto.getName().length()>=4 && dto.getName().length()<=20)
	     {
	    	 System.out.println("its a valid name:"+dto.getName());
	    	 System.out.println(dto);
	    	 nameType = true;
	    	 System.out.println("****************************************************************");
	  	   
	     }
	     else
	     {
	    	 throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not valid name");
	     }
	     if(dto.getBrand()!=null)
	     {
	    	 System.out.println("its a valid brand name:"+dto.getBrand());
	    	 System.out.println(dto);
	    	 brandType = true;
	    	 System.out.println("****************************************************************");
	  	   
	     }
	     else
	     {
	    	 throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not required data ");
	     }
	     if(dto.getNoOfSeats()!=0 && dto.getNoOfSeats()>=1000 && dto.getNoOfSeats()>0)
	     {
	    	 System.out.println("its a correct no of seats from this theater:"+dto.getNoOfSeats());
	    	 System.out.println(dto);
	    	 seatsType = true;
	    	 System.out.println("****************************************************************");
	  	   
	     }
	     else
	     {
	    	 throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not required data");
	     }
	     
	     if(idType && nameType && brandType && seatsType)
	     {
	    	 System.out.println("its a valid data it can save in repositary");
	    	 boolean saved = this.repositary.saving(dto);
	    	 return true;
	     }
		return false;
	}

}
