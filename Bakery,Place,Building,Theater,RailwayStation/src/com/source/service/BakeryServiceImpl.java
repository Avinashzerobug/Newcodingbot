package com.source.service;

import com.source.dto.BakeryDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.BakeryRepositary;

public class BakeryServiceImpl implements BakeryService {

	
	BakeryRepositary repositary;
	
	public BakeryServiceImpl(BakeryRepositary repositary) {
		super();
		this.repositary = repositary;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated {
	    System.out.println("Running the validate");
	    boolean validName = false;
	    boolean validOwnerName = false;
	    boolean validLocation = false;
	    boolean validFamousFor = false;
	    boolean validContactNo = false;
	    if(dto.getName()!=null && dto.getName().length()>=4 && dto.getName().length()<=20)
        {
	         
	         System.out.println("its valid information"+dto);
	         System.out.println("Valid name:"+dto.getName());
	          validName = true;
        }
	    else
	    {
	    	System.out.println("Custom exception initialzed");
	    	throw new CheckTheDataOnceAgainItsNotMatchingRequriements("check data its not valid name");
	    }
	    if(dto.getOwnerName()!=null&&dto.getOwnerName().length()>=4&&dto.getOwnerName().length()<=20)
	    {
	        System.out.println("its valid information"+dto);
	    	System.out.println("its a Valid ownerName"+dto.getOwnerName());
	    	validOwnerName = true;
	    }
	    else
	    {
	    	System.out.println("Custom exception initialzed");
	    	throw new CheckTheDataOnceAgainItsNotMatchingRequriements("check dats its not vaid owner name");
	    }
	    if(dto.getLocation()!=null&&dto.getLocation().length()>=3&&dto.getLocation().length()<=20)
	    {
	        System.out.println("its valid information"+dto);
	    	System.out.println("its a valid location"+dto.getLocation());
	    	 validLocation = true;
	    }
	    else
	    {
	    	System.out.println("Custom exception initialzed");
	    	throw new CheckTheDataOnceAgainItsNotMatchingRequriements("check the data its not valid location");
	    	
	    }
	    if(dto.getFamousFor()!=null&&dto.getFamousFor().length()>=4&&dto.getFamousFor().length()<=20)
	    {
	        System.out.println("its valid information"+dto);
	    	System.out.println("its a valid famous for sweets:"+dto.getFamousFor());
	    	 validFamousFor = true;
	    }
	    else
	    {
	    	System.out.println("Custom exception initialzed");
	    	throw new CheckTheDataOnceAgainItsNotMatchingRequriements("check the data its not having correct information");
	    }
	    if( dto.getContactNo()!=0)
	    {
	        System.out.println("its valid information"+dto);
	    	System.out.println("Its a valid contact Number:"+dto.getContactNo());
	    	validContactNo = true;
	    }
	    else
	    {
	    	System.out.println("Custom exception initialzed");
	    	throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not valid number");
	    }
	    if(validName&&validOwnerName&&validLocation&&validFamousFor&&validContactNo)
	    {
	    	System.out.println("its valid it can store in the repositary");
	    	boolean saved = this.repositary.saving(dto);
	    	return true;
	    }
	    
		return false;
	}

}
