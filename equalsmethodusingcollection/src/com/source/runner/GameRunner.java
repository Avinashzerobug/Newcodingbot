package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.source.collection.GameDTO;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GameDTO dto1 = new GameDTO("Assassin Creed 4 Black Flag","PC",1250);
		GameDTO dto2 = new GameDTO("Ass","PC",1250);
		GameDTO dto3 = new GameDTO("Assassin Creed 4 Black Flag" ,"PC",1250);
		GameDTO dto4 = new GameDTO("Assassin Creed ","PC",1250);	
		GameDTO dto5 = new GameDTO("Assassin Creeffg","PC",1250);
		
		
		Collection<GameDTO> collection = new ArrayList<GameDTO>();
	    collection.add(dto2);
		collection.add(dto1);
		
		boolean equals = dto1.equals(dto4);
		System.out.println(equals);
		
		boolean ref=collection.contains(dto3);
		System.out.println("contains:"+ref);
		
		
		
		
	}

}
