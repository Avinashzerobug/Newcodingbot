package com.source.boot;

import java.time.LocalDateTime;

import com.source.constant.Location;
import com.source.dto.PlaceDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.PlaceRepositary;
import com.source.repositary.PlaceRepositaryImpl;
import com.source.service.PlaceService;
import com.source.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlaceDTO dto = new PlaceDTO("Delhi","Taj Mahal",Location.AGHRA,250,5000);
		PlaceRepositary repositary = new PlaceRepositaryImpl();
		
		PlaceService service = new PlaceServiceImpl(repositary);
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
		
	}

}
