package com.encapsulation.access;

public class Mobile {

	private String name="Red mi Note 9 pro max";
	private int   series = 9;
	private String company="Xiomi";
	private int    noOfVersion=9;
	private boolean readiator = false;
	private int     fps= 120;
	private String chipSet="Snap Dragon 710";
	private String graphicsEngine="BOOSTED";
	private int    memoryInterface = 100;
	private String speed = "3.5 GHz";
	private String processor = "intel procesor";
	
	
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getNoOfVersion() {
		return noOfVersion;
	}
	public void setNoOfVersion(int noOfVersion) {
		this.noOfVersion = noOfVersion;
	}
	public boolean isReadiator() {
		return readiator;
	}
	public void setReadiator(boolean readiator) {
		this.readiator = readiator;
	}
	public int getFps() {
		return fps;
	}
	public void setFps(int fps) {
		this.fps = fps;
	}
	public String getChipSet() {
		return chipSet;
	}
	public void setChipSet(String chipSet) {
		this.chipSet = chipSet;
	}
	public String getGraphicsEngine() {
		return graphicsEngine;
	}
	public void setGraphicsEngine(String graphicsEngine) {
		this.graphicsEngine = graphicsEngine;
	}
	public int getMemoryInterface() {
		return memoryInterface;
	}
	public void setMemoryInterface(int memoryInterface) {
		this.memoryInterface = memoryInterface;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	
	
}
