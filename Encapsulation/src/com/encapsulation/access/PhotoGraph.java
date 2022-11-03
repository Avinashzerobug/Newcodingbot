package com.encapsulation.access;

public class PhotoGraph {

	
	private String name="Canon";
	private int   series = 13;
	private String company="Canon";
	private int    noOfVersion=34;
	private boolean readiator = true;
	private int     fps= 60;
	private String chipSet="core";
	private String graphicsEngine="BOOSTED";
	private int    memoryInterface = 500;
	private String speed = "10 clicks per sec";
	
	
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
	private String processor = "AMD RADEON";
	
	
	
	
}
