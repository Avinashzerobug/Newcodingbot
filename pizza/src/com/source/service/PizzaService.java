package com.source.service;

import com.source.constant.PizzaSize;
import com.source.dto.PizzaDTO;

public class PizzaService implements Pizza {

	@Override
	public boolean pizzaCreate(PizzaDTO dto) {
		/*
		 * String name = dto.getName(); double amount = dto.getPrice();
		 */
		boolean outPut = true;
		 boolean outPut2 = true;

		if (dto.getName().length() >= 4 && dto.getName().length() <= 20) 
		{
			System.out.println(System.lineSeparator());
			System.out.println("Valid name:" + dto.getName());
			System.out.println(System.lineSeparator());
			System.out.println(dto);
			System.out.println("***"+outPut+"***");
		}
		else
		{
			System.out.println(System.lineSeparator());
			System.err.println("its not valid name" + dto.getName());
			System.out.println(System.lineSeparator());
			System.out.println("***"+outPut2+"***");
		}
		if (dto.getPrice() >= 50 && dto.getPrice() <= 5000) {
			System.out.println(System.lineSeparator());
			System.out.println("valid price you can buy:" + dto.getPrice());
			System.out.println(System.lineSeparator());
			System.out.println(dto);
			
			System.out.println("***"+outPut+"***");
		}

		else 
		{
			System.out.println(System.lineSeparator());
			System.err.println("its not valid price");
			System.out.println(System.lineSeparator());
			System.out.println("***"+outPut2+"***");
		}

		
		
		if(dto.getCompany().length()>=4 && dto.getCompany().length()<=20)
		{
			System.out.println(System.lineSeparator());
			System.out.println("its a Valid Company name:"+dto.getCompany());
			System.out.println(System.lineSeparator());
			System.out.println(dto);
			System.out.println("***"+outPut+"***");
		}
		
		else
		{
			System.out.println(System.lineSeparator());
			System.err.println("its not valid company name");
			System.out.println(System.lineSeparator());
			System.out.println("***"+outPut2+"***");
		}
		
		if(dto.getSize()==PizzaSize.Large||dto.getSize()==PizzaSize.Small||dto.getSize()==PizzaSize.Regular)
		{
			System.out.println(System.lineSeparator());
			System.out.println("Valid pizza size:"+dto.getSize());
			System.out.println(System.lineSeparator());
			System.out.println(dto);
			System.out.println("***"+outPut+"***");
		}
		else
		{
			System.out.println(System.lineSeparator());
			System.err.println("its not valid pizza size");
			System.out.println(System.lineSeparator());
			System.out.println("***"+outPut2+"***");
		}
		
		if(dto.isCheese()==true)
		{
			System.out.println(System.lineSeparator());
			System.out.println("its having the cheese pizza:"+dto.isCheese());
			System.out.println(System.lineSeparator());
			System.out.println(dto);
			System.out.println("***"+outPut+"***");
			
		}
		else
		{
			System.out.println(System.lineSeparator());
			System.err.println("****Cheese not added in the pizza****");
			System.out.println(System.lineSeparator());
			System.out.println("***"+outPut2+"***");
		}
		
		if(dto.getFlavour().length()>=4 && dto.getFlavour().length()<=20)
		{
			System.out.println(System.lineSeparator());
			System.out.println("yes Flavour Mexican one :"+dto.getFlavour());
			System.out.println(System.lineSeparator());
			System.out.println(dto);
			System.out.println("***"+outPut+"***");
		}
		else 
		{
			System.out.println(System.lineSeparator());
			System.err.println("Cheese flavour not added");
			System.out.println(System.lineSeparator());
			System.out.println("***"+outPut2+"***");
		}
		
		if(dto.getType()=="Veg"||dto.getType()=="Non-Veg")
		{
			System.out.println(System.lineSeparator());
			System.out.println("Pizza type is good:"+dto.getType());
			System.out.println(System.lineSeparator());
			System.out.println(dto);
			System.out.println("***"+outPut+"***");
			
		}
		else
		{
			System.out.println(System.lineSeparator());
			System.err.println("Pizza type is not mexican");
			System.out.println(System.lineSeparator());
			System.out.println("***"+outPut2+"***");
		}
		
		if(outPut && outPut2==true)
		{
			return true;
		}
		else
		{
			System.err.println("Any one condition is not true and so check it");
		}

		return false;
	}

}
