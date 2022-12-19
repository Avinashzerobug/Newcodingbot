package com.source.service;

import com.source.dto.RailWayStationDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.RailWayRepositary;

public class RailWayStationServiceImpl implements RailWayService {

	RailWayRepositary repositary;

	public RailWayStationServiceImpl(RailWayRepositary repositary) {
		super();
		this.repositary = repositary;
	}

	
	@Override
	public boolean validateAndSaved(RailWayStationDTO dto) throws SizeIsFullExceptionInitiated, CheckTheDataOnceAgainItsNotMatchingRequriements {
		
		boolean nameType = false;
		boolean platFormsType = false;
		boolean areaType = false;
		boolean ticketPriceType = false;
		
		if(dto.getName()!=null && dto.getName().length()>=4 && dto.getName().length()<=30)
		{
			System.out.println("its a valid name :"+dto.getName());
			System.out.println(dto);
			nameType = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not valid name");
		}
		if(dto.getNoOfPlatForms()!=0 && dto.getNoOfPlatForms()>0)
		{
			System.out.println("its a valid platform number:"+dto.getNoOfPlatForms());
			System.out.println(dto);
			platFormsType = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not valid platform number");
		}
		if(dto.getArea()!=null)
		{
			System.out.println("its a valid area name:"+dto.getArea());
			System.out.println(dto);
			areaType = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not valid area name");
		}
		if(dto.getTicketPrice()!=0 && dto.getTicketPrice()>0)
		{
			System.out.println("its a valid ticket price:"+dto.getTicketPrice());
			System.out.println(dto);
			ticketPriceType = true;
		}
		
		if(nameType && platFormsType && areaType && ticketPriceType)
		{
			System.out.println("its valid information it can store in the repositary");
			boolean saved = this.repositary.saved(dto);
			return true;
		}
		
		return false;
	}

	
	
}

