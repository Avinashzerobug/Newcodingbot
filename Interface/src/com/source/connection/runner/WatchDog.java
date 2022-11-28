package com.source.connection.runner;

import com.source.connection.Game;

public class WatchDog  implements Game{

	@Override
	public String companyName() {
		System.out.println("UBISOFT");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfGames() {
		System.out.println(500);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String gameName() {
		System.out.println("Watch Dog Legion");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int price() {
		System.out.println(2000);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int storage() {
		System.out.println("storage:"+59+"gb");
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
}
