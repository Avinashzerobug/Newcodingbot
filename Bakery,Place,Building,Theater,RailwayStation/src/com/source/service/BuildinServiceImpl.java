package com.source.service;

import com.source.constant.Rooms;
import com.source.dto.BuildingDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.BuildingRepositary;

public class BuildinServiceImpl implements BuildingService {

	BuildingRepositary repositary;
	
	
	
	
	
	public BuildinServiceImpl(BuildingRepositary repositary) {
		super();
		this.repositary = repositary;
	}





	@Override
	public boolean validateAndSaved(BuildingDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated {
	
	
		
		boolean nameType = false;
		boolean location = false;
		boolean roomType = false;
		boolean floorsType = false;
		boolean liftType = false;
		
		if(dto.getName()!=null && dto.getName().length()>=4 && dto.getName().length()<=20)
		{
			System.out.println("its a valid name :"+dto.getName());
			nameType = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("check the data its not valid name");
			
		}
		if(dto.getLocation()!=null)
		{
			System.out.println("its valid location name:"+dto.getLocation());
			System.out.println(dto);
			location = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("check the data its a invalid location name");
			
		}
		if(dto.getRoomName()!=null)
		{
			System.out.println("its a valid Room name:"+dto.getRoomName());
			System.out.println(dto);
			roomType = true;		
		}    
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("check the data its a invalid room name");
		}
		if(dto.getFloors()!=0 && dto.getFloors()>0)
		{
			System.out.println("its a valid number of floors:"+dto.getFloors());
			System.out.println(dto);
			 floorsType = true;
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its a invalid floors");
		}
		if(dto.isLift()==true)
		{
			System.out.println("its valid data...having the life in the building");
			System.out.println(dto);
			liftType = true;
			
		}
		else
		{
			throw new CheckTheDataOnceAgainItsNotMatchingRequriements("Check the data its not having the lift in the building ");
		}
		
		if(nameType && location && roomType && floorsType && liftType )
		{
			System.out.println("its a valid properties it can save to the repositary");
			boolean saved = this.repositary.saving(dto);
			return true;
		}
		
			
	return false;
	}

}
