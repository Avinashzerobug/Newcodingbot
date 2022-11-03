package com.encapsulation.access;

public class GraphicsCard {

	
	private String name="Nvidia";
	private int   series = 4090;
	private String company="Asus";
	private int    noOfVersion=4090;
	private boolean readiator = true;
	private int     fps= 60;
	private String chipSet="core";
	private String graphicsEngine="BOOSTED";
	private int    memoryInterface = 4000;
	private String speed = "RUNNER";
	private String processor = "AMD RADEON";
	
	
	
	public GraphicsCard()
	{
		
	}



	public String getName() {
		return name;
	}



	 void setName(String name) {
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



	public void setGraphicsEngine(String graphicsEngine) {
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
