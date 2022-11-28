package com.source.connection.runner;

import com.source.connection.VideoGames;

public class AssassinCreedOrigin implements VideoGames {

	@Override
	public String gameName() {
		System.out.println("Assassin Creed");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfSales() {
		System.out.println(50000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String characterName() {
		System.out.println("Desmond");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean gameEnds() {
		System.out.println(true);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String developerName() {
		System.out.println("Avinash");
		// TODO Auto-generated method stub
		return null;
	}

}
