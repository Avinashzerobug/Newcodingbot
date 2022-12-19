package com.source.boot;

import java.time.LocalDateTime;

import com.source.dto.BakeryDTO;
import com.source.exception.CheckTheDataOnceAgainItsNotMatchingRequriements;
import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.repositary.BakeryRepositary;
import com.source.repositary.BakeryRepositaryImpl;
import com.source.service.BakeryService;
import com.source.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) throws CheckTheDataOnceAgainItsNotMatchingRequriements {
		// TODO Auto-generated method stub

   BakeryDTO dto = new BakeryDTO("Ayyangar Bakery","Ayyangar","Vidyagiri BGK","Egg Puff",235687457L);
    dto.setCreatedby("Avinash Mullur");
	dto.setCreatedDateTime(LocalDateTime.now());
	dto.setUpdatedBy("Avinash");
	dto.setUpdatedDateTime(LocalDateTime.now());
	
   BakeryRepositary repositary = new BakeryRepositaryImpl();
   BakeryService service = new BakeryServiceImpl(repositary);		
		
	
   boolean saved;
try
{
	saved = service.validateAndSave(dto);
	  System.out.println(saved);
} 
catch (CheckTheDataOnceAgainItsNotMatchingRequriements e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
catch (SizeIsFullExceptionInitiated e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
   
		
	}

}
