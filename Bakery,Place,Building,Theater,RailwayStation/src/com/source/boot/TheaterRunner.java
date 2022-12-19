package com.source.boot;

import java.time.LocalDateTime;

import com.source.constant.Brand;
import com.source.dto.TheaterDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.TheaterRepositary;
import com.source.repositary.TheaterRepositaryImpl;
import com.source.service.TheaterService;
import com.source.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TheaterDTO dto = new TheaterDTO(356,"Shakti Theater",Brand.IMAX,5700);
		dto.setCreatedby("Avinash Mullur");
		dto.setCreatedDateTime(LocalDateTime.now());
		dto.setUpdatedBy("Avinash");
		dto.setUpdatedDateTime(LocalDateTime.now());
		
		TheaterRepositary repositary = new TheaterRepositaryImpl();
		
		TheaterService service = new TheaterServiceImpl(repositary);
		
		
		
		boolean saved;
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
