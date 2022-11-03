package com.encapsulation.access.nun;

import com.encapsulation.access.Songs;
import com.encapsulation.access.SongsAccess;

public class SongsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Songs sin = new Songs();
		SongsAccess son = new SongsAccess();
				
		System.out.println(sin. getName());
		System.out.println(sin. getSeries());
		System.out.println(sin. getSinger());
		System.out.println(sin. getNoOfSongsc());
		System.out.println(sin. isSongFamous());
		System.out.println(sin. getViews());
		System.out.println(sin. getLyrics());
		System.out.println(sin. getLanguage());
		System.out.println(sin. getBgmVolume());
		System.out.println(sin. getMusic());
		System.out.println(sin. getOwnerOfProduction());
		System.out.println(sin. getOwnerOfProduction());
		
		
		System.out.println(System.lineSeparator());
		
		son.sing(sin);
		
		
		
		
		
		
		
		
		
		
	}

}
