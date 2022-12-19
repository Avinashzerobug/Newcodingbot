package com.source.boot;

import java.time.LocalDateTime;

import com.source.constant.Rooms;
import com.source.dto.BuildingDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.BuildingRepositary;
import com.source.repositary.BuildingRepositaryImpl;
import com.source.service.BuildinServiceImpl;
import com.source.service.BuildingService;

public class BuildingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuildingDTO dto = new BuildingDTO("Bh","Dubai",Rooms.JANNAT,2000,true);
		BuildingRepositary repositary = new BuildingRepositaryImpl();
		
		BuildingService service = new BuildinServiceImpl(repositary);
		    dto.setCreatedby("Avinash Mullur");
			dto.setCreatedDateTime(LocalDateTime.now());
			dto.setUpdatedBy("Avinash");
			dto.setUpdatedDateTime(LocalDateTime.now());
			
		
		
			try {
				service.validateAndSaved(dto);
			} catch (CheckTheDataOnceAgainItsNotMatchingRequriements e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SizeIsFullExceptionInitiated e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
			System.out.println("Execute all data");
			}
	}

}
