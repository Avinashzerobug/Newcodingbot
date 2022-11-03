package com.encapsulation.access;

public class ChipSet {

	private String name="Intel";
	private int   series = 10;
	private String company="Intel";
	private int    noOfVersion=10;
	private boolean readiator = false;
	private int     fps= 120;
	private String chipSet="core";
	private String graphicsEngine="BOOSTED";
	private int    memoryInterface = 1000;
	private String speed = "3.5 GHz";
	private String processor = "intel procesor";
	
	
	public String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	public int getSeries() {
		return series;
	}
	 void setSeries(int series) {
		this.series = series;
	}
	public String getCompany() {
		return company;
	}
	 void setCompany(String company) {
		this.company = company;
	}
	public int getNoOfVersion() {
		return noOfVersion;
	}
	 void setNoOfVersion(int noOfVersion) {
		this.noOfVersion = noOfVersion;
	}
	public boolean isReadiator() {
		return readiator;
	}
	 void setReadiator(boolean readiator) {
		this.readiator = readiator;
	}
	public int getFps() {
		return fps;
	}
	 void setFps(int fps) {
		this.fps = fps;
	}
	public String getChipSet() {
		return chipSet;
	}
	 void setChipSet(String chipSet) {
		this.chipSet = chipSet;
	}
	public String getGraphicsEngine() {
		return graphicsEngine;
	}
 void setGraphicsEngine(String graphicsEngine) {
		this.graphicsEngine = graphicsEngine;
	}
	public int getMemoryInterface() {
		return memoryInterface;
	}
	 void setMemoryInterface(int memoryInterface) {
		this.memoryInterface = memoryInterface;
	}
	public String getSpeed() {
		return speed;
	}
	 void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getProcessor() {
		return processor;
	}
	 void setProcessor(String processor) {
		this.processor = processor;
	}

	
}
