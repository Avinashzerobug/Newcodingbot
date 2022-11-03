package com.encapsulation.access;

public class SpaceStation {
	
	private String name ="ISS";
	private double weight=235.2 ;
	private String  country = "USA";
	private int     noOfDocking = 4;
	private int     habitaleVolume=500;
	private String  astronauts= "Michael Collins";
	private boolean morePower = true;
	private String  spaceCraftName = "Falcon";
	private double  gravity = 9.8;
	private int     length = 80;
	private String  organisation = "NASA";
	
	public SpaceStation()
	{
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoOfDocking() {
		return noOfDocking;
	}

	public void setNoOfDocking(int noOfDocking) {
		this.noOfDocking = noOfDocking;
	}

	public int getHabitaleVolume() {
		return habitaleVolume;
	}

	public void setHabitaleVolume(int habitaleVolume) {
		this.habitaleVolume = habitaleVolume;
	}

	public String getAstronauts() {
		return astronauts;
	}

	public void setAstronauts(String astronauts) {
		this.astronauts = astronauts;
	}

	public boolean isMorePower() {
		return morePower;
	}

	public void setMorePower(boolean morePower) {
		this.morePower = morePower;
	}

	public String getSpaceCraftName() {
		return spaceCraftName;
	}

	public void setSpaceCraftName(String spaceCraftName) {
		this.spaceCraftName = spaceCraftName;
	}

	public double getGravity() {
		return gravity;
	}

	public void setGravity(double gravity) {
		this.gravity = gravity;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public double getWeight()
	{
		return weight;
	}
	
	 void setWeight(double weight)
	{
	   this.weight = weight;
		
	}
	
	
		
		
	}
	
	
	

