package com.source.boot;

import com.source.constant.Color;
import com.source.dto.HelmetDTO;
import com.source.repositary.HelmetRepositary;
import com.source.repositary.HelmetRepositaryImpl;
import com.source.serivce.HelmetService;
import com.source.serivce.HelmetServieImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HelmetRepositary repositary  = new HelmetRepositaryImpl();
	HelmetDTO dto = new HelmetDTO("Military","Thunder",2000D,Color.Black);
	
	HelmetService service = new HelmetServieImpl(repositary);
	boolean succeed = service.saveDataAndModify(dto);
	System.out.println("Success:"+succeed);
	
		
		
		
	}

}
