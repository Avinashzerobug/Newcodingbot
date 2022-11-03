package com.encapsulation.access;

public class Songs {

	private String name="Living in the night";
	private int   series = 11;
	private String singer="Charlie puth";
	private int    noOfSongsc=1000;
	private boolean isSongFamous = true;
	private int     views= 65345534;
	private String lyrics="living in the life in the night";
	private String language="English";
	private int    bgmVolume = 4000;
	private String Music = "Good";
	private String ownerOfProduction = "Avinash";
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getNoOfSongsc() {
		return noOfSongsc;
	}
	public void setNoOfSongsc(int noOfSongsc) {
		this.noOfSongsc = noOfSongsc;
	}
	public boolean isSongFamous() {
		return isSongFamous;
	}
	public void setSongFamous(boolean isSongFamous) {
		this.isSongFamous = isSongFamous;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getBgmVolume() {
		return bgmVolume;
	}
	public void setBgmVolume(int bgmVolume) {
		this.bgmVolume = bgmVolume;
	}
	public String getMusic() {
		return Music;
	}
	public void setMusic(String music) {
		Music = music;
	}
	public String getOwnerOfProduction() {
		return ownerOfProduction;
	}
	public void setOwnerOfProduction(String ownerOfProduction) {
		this.ownerOfProduction = ownerOfProduction;
	}
	

	
}
