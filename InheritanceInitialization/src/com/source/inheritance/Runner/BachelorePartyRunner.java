package com.source.inheritance.Runner;

import com.source.inheritance.BacheloreParty;
import com.source.inheritance.Super.YenneParty;

public class BachelorePartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BacheloreParty bach = new YenneParty("OLD MONK",true,45);
		
		YenneParty yen = (YenneParty)bach;
		yen.display();
		
		
		
		
		
		
		
	}

}
