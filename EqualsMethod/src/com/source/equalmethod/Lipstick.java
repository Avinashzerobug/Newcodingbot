package com.source.equalmethod;

public class Lipstick {

	

	 private String name;
	 private double price;
	 private String companyName;
	 private String color;
	 private boolean uVProtection;
	 private String ownerName;
	 private String companyStarted;
	 private String productionArea;
	 private String stockMarketName;
	 private String taxName;
	 
	public Lipstick(String name, double price, String companyName, String color, boolean uVProtection, String ownerName,
			String companyStarted, String productionArea, String stockMarketPrice, String taxName) {
		super();
		this.name = name;
		this.price = price;
		this.companyName = companyName;
		this.color = color;
		this.uVProtection = uVProtection;
		this.ownerName = ownerName;
		this.companyStarted = companyStarted;
		this.productionArea = productionArea;
		this.stockMarketName = stockMarketPrice;
		this.taxName = taxName;
	}

	@Override
	public String toString() {
		return "vehicle [name=" + name + ", price=" + price + ", companyName=" + companyName + ", color=" + color
				+ ", uVProtection=" + uVProtection + ", ownerName=" + ownerName + ", companyStarted=" + companyStarted
				+ ", productionArea=" + productionArea + ", stockMarketPrice=" + stockMarketName + ", taxIncluded="
				+ taxName + "]";
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Lipstick)
		{
			Lipstick lip = (Lipstick)obj;
			if(this.name.equals(lip.name)&&this.companyName.equals(lip.companyName)&&this.color.equals(lip.color)&&this.companyStarted.equals(lip.companyStarted)&&this.ownerName.equals(lip.ownerName)&&this.productionArea.equals(lip.productionArea)&&this.stockMarketName.equals(lip.stockMarketName)&&this.taxName.equals(lip.taxName))
			{
				
				System.out.println("both properties are equal in Lipstick");
				return true;
				
			}
			
	   else
			{
				System.out.println("These properties are not equal");
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isuVProtection() {
		return uVProtection;
	}

	public void setuVProtection(boolean uVProtection) {
		this.uVProtection = uVProtection;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCompanyStarted() {
		return companyStarted;
	}

	public void setCompanyStarted(String companyStarted) {
		this.companyStarted = companyStarted;
	}

	public String getProductionArea() {
		return productionArea;
	}

	public void setProductionArea(String productionArea) {
		this.productionArea = productionArea;
	}

	public String getStockMarketPrice() {
		return stockMarketName;
	}

	public void setStockMarketPrice(String stockMarketPrice) {
		this.stockMarketName = stockMarketPrice;
	}

	public String isTaxIncluded() {
		return taxName;
	}

	public void setTaxIncluded(String taxName) {
		this.taxName = taxName;
	}
	 
	 
	
	
	
	
	
	
	
	
}
