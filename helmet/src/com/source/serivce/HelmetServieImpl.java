package com.source.serivce;

import com.source.dto.HelmetDTO;
import com.source.repositary.HelmetRepositary;

public class HelmetServieImpl implements HelmetService {

	
	
	HelmetRepositary helmetRepositary;
	
	
	public HelmetServieImpl(HelmetRepositary helmetRepositary) {
		super();
		this.helmetRepositary = helmetRepositary;
	}


	@Override
	public boolean saveDataAndModify(HelmetDTO dto) {
		
		boolean validate1 = false;
		boolean validate2 = false;
		boolean validate3 = false;
		boolean validate4= false;
		
		if(dto.getName().length()>=4 &&dto.getName().length()<=20)
		{
			System.out.println("Valid name:"+dto.getName());
			validate1 = true;
		}
		else
		{
			System.err.println("its not valid name:"+dto.getName());
		}
		
		if(dto.getType()!=null)
		{
			System.out.println("The Helmet having certain type: "+dto.getType());
			validate2 = true;
		}
		else
		{
			System.err.println("The type is pointing to the null:");
			
		}
		
		if(dto.getPrice()>=50&&dto.getPrice()<=6000)
		{
			System.out.println("This is the valid price:"+dto.getPrice());
			validate3 = true;
		}
		else
		{
			System.err.println("This is not valid price:"+dto.getPrice());
		}
		if(dto.getColor()!=null)
		{
			System.out.println("This is the valid color:"+dto.getColor());
			validate4 =true;
		}
		else
		{
			System.out.println("This is color is pointing to the null");
		}
		
		if(validate1 && validate2 && validate3 &&  validate4)
		{
			System.out.println("Helmet DTO is valid it can save in the repositary");
			boolean save= this.helmetRepositary.saved(dto);
			return true;
		}
		
		
		
		return false;
		
		
		
	}

}
