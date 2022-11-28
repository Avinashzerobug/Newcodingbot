package com.source.connection.runner2;

import com.source.connection.Game;
import com.source.connection.runner.WatchDog;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Game game= new WatchDog();
		WatchDog watchDog=new WatchDog();
		
		game.companyName();
		game.gameName();
		game.noOfGames();
		game.price();
		game.storage();
		
		
		
	}

}
