package com.encapsulation.access;

public class Car {
	
	private String name="Mercedes Benz";
	private String   series = "AMG GLA 35";
	private String company="Daimler Truck";
	private int    noOfVersion=4090;
	private boolean readiator = true;
	private int     milage= 20;
	private String ai="SIRI";
	private String engineName="V8";
	private int    engineWeight = 400;
	private String speed = "RUNNER";
	private String tireName = "MRF";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
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
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getAi() {
		return ai;
	}
	public void setAi(String ai) {
		this.ai = ai;
	}
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	public int getEngineWeight() {
		return engineWeight;
	}
	public void setEngineWeight(int engineWeight) {
		this.engineWeight = engineWeight;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getTireName() {
		return tireName;
	}
	public void setTireName(String tireName) {
		this.tireName = tireName;
	}
	
}
