package com.encapsulation.access;

public class ElectricCar {

	
	private String name="Road ster";
	private String   series = "S series";
	private String company="Tesla";
	private int    noOfVersion=2;
	private boolean readiator = true;
	private int     milage= 350;
	private String ai="SIRI";
	private String battery="Lithium battery";
	private int    batteryWeight = 400;
	private String speed = "Faster";
	private String tireName = "MRF";
	
	public String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	public String getSeries() {
		return series;
	}
	 void setSeries(String series) {
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
	public int getMilage() {
		return milage;
	}
	 void setMilage(int milage) {
		this.milage = milage;
	}
	public String getAi() {
		return ai;
	}
	 void setAi(String ai) {
		this.ai = ai;
	}
	public String getBattery() {
		return battery;
	}
	 void setBattery(String battery) {
		this.battery = battery;
	}
	public int getBatteryWeight() {
		return batteryWeight;
	}
	 void setBatteryWeight(int batteryWeight) {
		this.batteryWeight = batteryWeight;
	}
	public String getSpeed() {
		return speed;
	}
	 void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getTireName() {
		return tireName;
	}
	 void setTireName(String tireName) {
		this.tireName = tireName;
	}
	
	
		
	
}
