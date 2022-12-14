package com.source.boot;
 
import java.time.LocalDateTime;

import com.source.constant.PizzaSize;
import com.source.dto.PizzaDTO;
import com.source.service.Pizza;
import com.source.service.PizzaService;

public class PizzaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	PizzaDTO pizzaDto = new PizzaDTO();	
	Pizza pizza = new PizzaService();
	
	pizzaDto.setPrice(3000);
	pizzaDto.setType("Veg");
	pizzaDto.setFlavour("Cheese Flavour");
	pizzaDto.setCheese(false);
	pizzaDto.setSize(PizzaSize.Large);
	pizzaDto.setCompany("Pizza Hut");
	pizzaDto.setName("Mexican Cheese Pizza");
    pizzaDto.setCreatedby("Avinash");
    pizzaDto.setCreatedDateTime(LocalDateTime.now());
    pizzaDto.setUpdatedBy("Avinash Only");
    pizzaDto.setUpdatedDateTime(LocalDateTime.now());
		
    pizza.pizzaCreate(pizzaDto);
		
		
		
		
	}

}
