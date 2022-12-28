package com.soruce.runner;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.soruce.dto.SanitizerDTO;

public class SanitzaryRunner extends  SanitizerDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		SanitizerDTO dto = new SanitizerDTO(456,"Sterillium",500,"blue");
		SanitizerDTO dto1 = new SanitizerDTO(457,"Savlon",300,"red");
		SanitizerDTO dto2 = new SanitizerDTO(458,"Life-buoy",250,"blue");
		SanitizerDTO dto3 = new SanitizerDTO(459,"Godrej",550,"green");
		SanitizerDTO dto4 = new SanitizerDTO(460,"Tata",500,"blue");
		SanitizerDTO dto5 = new SanitizerDTO(4565,"Dabur",200,"yellow");
		SanitizerDTO dto6 = new SanitizerDTO(456,"Multani",300,"blue");
		SanitizerDTO dto7 = new SanitizerDTO(4535,"Corvil",400,"white");
		SanitizerDTO dto8 = new SanitizerDTO(45656,"Turst",150,"blue");
		SanitizerDTO dto9 = new SanitizerDTO(456,"DCM shriram",200,"black");
		
		
		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto9);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		collection.add(dto);
		
		
		
		
		Iterator<SanitizerDTO> iterator = collection.iterator();
		
		while(iterator.hasNext())
		{
			 SanitizerDTO ref=iterator.next();
			if(ref.getPrice()>=5)
			{
				System.out.println("its a fair price for sanitizer:"+ref.getPrice());
			}
			
			if(ref.getBrand()==null||ref.getColor()==null||ref.getId()==0||ref.getPrice()
					==0)
			{
				System.out.println("some of the sanitizer properties pointing to the null");
				System.out.println(ref.getBrand());
				System.out.println(ref.getColor());
				System.out.println(ref.getId());
				System.out.println(ref.getPrice());
			}
			
			if(ref.getColor()=="green"||ref.getColor()=="red"||ref.getColor()=="blue")
			{
				System.out.println("color of the sanitizer:"+ref.getColor());
			}
		
			
	        if(ref.getPrice()>500)
	        {
	        	System.out.println("its a maximum price:"+ref.getPrice());
	        	System.out.println(System.lineSeparator());
	        }
			
	        if(ref.getPrice()<300)
	        {
	        	System.out.println("its a minimum price:"+ref.getPrice());
	        	System.out.println(System.lineSeparator());
	        }
			if(ref.getPrice()>=400)
			{
				System.out.println("its a second maximum price:"+ref.getPrice());
				System.out.println(System.lineSeparator());
			}
	        
		}
		
		
	   
		
		
		
	}

}
