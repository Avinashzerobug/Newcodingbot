package com.encapsulation.access;

public class SongsAccess {
	
	public Songs song;
	
	public void sing( Songs song)
	{

	
	song.setName("We dont talk anymore");
	System.out.println(song. getName());
	
	System.out.println(song. getSeries());
	song.setSeries(1080);
	System.out.println(song. getSeries());
	
	System.out.println(song. getSinger());
	song.setSinger("AMD");
	System.out.println(song.getSinger());
	
	System.out.println(song. getNoOfSongsc());
	song.setNoOfSongsc(1090);
	System.out.println(song.getNoOfSongsc());
	
	System.out.println(song. isSongFamous());
	song.setSongFamous(true);
	System.out.println(song. isSongFamous());
	
	System.out.println(song. getViews());
	song.setViews(60);
	System.out.println(song. getViews());
	
	System.out.println(song. getLyrics());
	song.setLyrics("AMD");
	System.out.println(song. getLyrics());
	
	System.out.println(song. getLanguage());
	song.setLanguage("Low PowerFull");
	System.out.println(song. getLanguage());
	
	System.out.println(song. getBgmVolume());
	song.setBgmVolume(500);
	System.out.println(song. getBgmVolume());
	
	System.out.println(song. getOwnerOfProduction());
	song.setOwnerOfProduction("Faster");
	System.out.println(song. getOwnerOfProduction());
	
	System.out.println(song. getMusic());
	song.setMusic("Faster");
	System.out.println(song. getMusic());
	

	
	}
	
	
	
	
}
