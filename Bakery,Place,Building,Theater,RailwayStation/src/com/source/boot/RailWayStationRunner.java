package com.source.boot;

import java.time.LocalDateTime;

import com.source.constant.Area;
import com.source.dto.RailWayStationDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.RailWayRepositary;
import com.source.repositary.RailWayStationRepositary;
import com.source.service.RailWayService;
import com.source.service.RailWayStationServiceImpl;

public class RailWayStationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RailWayStationDTO dto = new RailWayStationDTO("Bagalkot RailWay Station",2,Area.BAGALKOT,500.0);
		RailWayRepositary repositary = new RailWayStationRepositary();
		RailWayService service = new RailWayStationServiceImpl(repositary);
		    dto.setCreatedby("Avinash Mullur");
			dto.setCreatedDateTime(LocalDateTime.now());
			dto.setUpdatedBy("Avinash");
			dto.setUpdatedDateTime(LocalDateTime.now());
			
		try {
			service.validateAndSaved(dto);
		} catch (SizeIsFullExceptionInitiated e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckTheDataOnceAgainItsNotMatchingRequriements e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("if exceptin occurs the execution will continue ...*this sentence determines the i'm using the finally keyword to continue the execution program");
		}
		 
	}

}
