package com.source.equalmethod;

public class God {

	 private String name;
	 private double noOftemples;
	 private String templeName;
	 private String color;
	 private boolean power;
	 private String sonName;
	 private int    prasadPrice;
	 private String godName;
	 private double dailyFund;
	 private boolean taxIncluded;
	 
	 

	public God(String name, double noOftemples, String templeName, String color, boolean power, String sonName,
			int prasadPrice, String godName, double dailyFund, boolean taxIncluded) {
		super();
		this.name = name;
		this.noOftemples = noOftemples;
		this.templeName = templeName;
		this.color = color;
		this.power = power;
		this.sonName = sonName;
		this.prasadPrice = prasadPrice;
		this.godName = godName;
		this.dailyFund = dailyFund;
		this.taxIncluded = taxIncluded;
	}



  @Override
	public String toString() {
		return "God [name=" + name + ", noOftemples=" + noOftemples + ", templeName=" + templeName + ", color=" + color
				+ ", power=" + power + ", sonName=" + sonName + ", prasadPrice=" + prasadPrice + ", godName=" + godName
				+ ", dailyFund=" + dailyFund + ", taxIncluded=" + taxIncluded + "]";
	}



public boolean equals(Object object)
  {
  	if(object instanceof God) {
  		
  		God god = (God)object;
  	 if(this.name.equals(god.name)&&this.templeName.equals(god.templeName)&&this.color.equals(god.color)&&this.godName.equals(god.godName)&&this.sonName.equals(god.sonName))
  	 {
  		 System.out.println("Both God Powers are Equal");
  		 return true;
  	 }   	
  
  	
  	 else
  	 {
  		 System.out.println("Both God are not equal");
  		
  	 }
  	}
		return false;		
  }



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public double getNoOftemples() {
	return noOftemples;
}



public void setNoOftemples(double noOftemples) {
	this.noOftemples = noOftemples;
}



public String getTempleName() {
	return templeName;
}



public void setTempleName(String templeName) {
	this.templeName = templeName;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public boolean isPower() {
	return power;
}



public void setPower(boolean power) {
	this.power = power;
}



public String getSonName() {
	return sonName;
}



public void setSonName(String sonName) {
	this.sonName = sonName;
}



public int getPrasadPrice() {
	return prasadPrice;
}



public void setPrasadPrice(int prasadPrice) {
	this.prasadPrice = prasadPrice;
}



public String getGodName() {
	return godName;
}



public void setGodName(String godName) {
	this.godName = godName;
}



public double getDailyFund() {
	return dailyFund;
}



public void setDailyFund(double dailyFund) {
	this.dailyFund = dailyFund;
}



public boolean isTaxIncluded() {
	return taxIncluded;
}



public void setTaxIncluded(boolean taxIncluded) {
	this.taxIncluded = taxIncluded;
}
	

	
	
}
