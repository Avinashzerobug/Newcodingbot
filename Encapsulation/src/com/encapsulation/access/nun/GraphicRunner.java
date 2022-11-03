package com.encapsulation.access.nun;

import com.encapsulation.access.Graphic;
import com.encapsulation.access.GraphicsCard;

public class GraphicRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GraphicsCard graphy = new GraphicsCard();
		Graphic gr = new Graphic();
		
		System.out.println(graphy.getName());

		System.out.println(graphy.getSeries());
		System.out.println(graphy.getCompany());
		System.out.println(graphy.getNoOfVersion());
		System.out.println(graphy.isReadiator());
		System.out.println(graphy.getFps());
		System.out.println(graphy.getChipSet());
		System.out.println(graphy.getGraphicsEngine());
		System.out.println(graphy.getMemoryInterface());
		System.out.println(graphy.getProcessor());
		System.out.println(graphy.getSpeed());
		
		 System.out.println(System.lineSeparator());  
		
		gr.graphic(graphy);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
		
		
	}