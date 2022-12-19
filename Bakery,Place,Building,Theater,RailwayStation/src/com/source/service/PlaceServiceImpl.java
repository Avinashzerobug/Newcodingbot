package com.source.service;

import com.source.dto.PlaceDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.PlaceRepositary;

public class PlaceServiceImpl implements PlaceService{

	PlaceRepositary repositary;
	
	public PlaceServiceImpl(PlaceRepositary repositary) {
		super();
		this.repositary = repositary;
	}

	@Override
	public boolean validateAndSaved(PlaceDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated {
		
		boolean nameType = false;
		boolean toursitType = false;
		boolean locationType = false;
		boolean ticketType = false;
		boolean visitorsType = false;
		
		if(dto.getName()!=null && dto.getName().length()>=4 && dto.getName().length()<=20)
		{
			System.out.println("its a valid name :"+dto.getName());
			System.out.println(dto);
			nameType = true;
		}
		else 
		{
		throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not valid name");
		}
		if(dto.getToursitName()!=null && dto.getToursitName().length()>4 && dto.getToursitName().length()<=20)
		{
			System.out.println("its a valid tourist name:"+dto.getToursitName());
			System.out.println(dto);
			toursitType = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its invalid");
		}
		if(dto.getLocation()!=null)
		{
			System.out.println("its a valid location:"+dto.getLocation());
			System.out.println(dto);
			locationType = true;	
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("its not valid location check the data");
		}
		if(dto.getTicketPrice()!=0 && dto.getTicketPrice()==250 && dto.getTicketPrice()>0)
		{
			System.out.println("its a valid ticket price:"+ dto.getTicketPrice());
			System.out.println(dto);
			 ticketType = true;
			
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not valid ticker price");
		}
		if(dto.getNoOfVisitors()!=0)
		{
			System.out.println("todays Visitors are counted:"+dto.getNoOfVisitors());
			System.out.println(dto);
			visitorsType = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its showing the invalid visitors");
		}
		
		if(nameType && toursitType && locationType && ticketType && visitorsType )
		{
			System.out.println("its valid properties it can store in the repositary");
			boolean saved = this.repositary.saved(dto);
			return true;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		return false;
	}

}
