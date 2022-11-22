package com.source.equalmethod;

public class Paint {

	 private String name;
	 private double price;
	 private String companyName;
	 private String color;
	 private boolean uVProtection;
	 private String ownerName;
	 private int    companyStarted;
	 private String productionArea;
	 private double stockMarketPrice;
	 private boolean taxIncluded;
	 
	 
	public Paint(String name, double price, String companyName, String color, boolean uVProtection, String ownerName,
			int companyStarted, String productionArea, double stockMarketPrice, boolean taxIncluded) {
		super();
		this.name = name;
		this.price = price;
		this.companyName = companyName;
		this.color = color;
		this.uVProtection = uVProtection;
		this.ownerName = ownerName;
		this.companyStarted = companyStarted;
		this.productionArea = productionArea;
		this.stockMarketPrice = stockMarketPrice;
		this.taxIncluded = taxIncluded;
	}

	
	

	@Override
	public String toString() {
		return "Paint [name=" + name + ", price=" + price + ", companyName=" + companyName + ", color=" + color
				+ ", uVProtection=" + uVProtection + ", ownerName=" + ownerName + ", companyStarted=" + companyStarted
				+ ", productionArea=" + productionArea + ", stockMarketPrice=" + stockMarketPrice + ", taxIncluded="
				+ taxIncluded + "]";
	}

    public boolean equals(Object object)
    {
    	if(object instanceof Paint) {
    		
    	 Paint paint = (Paint)object;
    	 if(this.name.equals(paint.name))
    	 {
    		 System.out.println("Both properties are equal");
    		 return true;
    	 }   	
    
    	
    	 else
    	 {
    		 System.out.println("Both properties are not equal");
    		
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


	public int getCompanyStarted() {
		return companyStarted;
	}


	public void setCompanyStarted(int companyStarted) {
		this.companyStarted = companyStarted;
	}


	public String getProductionArea() {
		return productionArea;
	}


	public void setProductionArea(String productionArea) {
		this.productionArea = productionArea;
	}


	public double getStockMarketPrice() {
		return stockMarketPrice;
	}


	public void setStockMarketPrice(double stockMarketPrice) {
		this.stockMarketPrice = stockMarketPrice;
	}


	public boolean isTaxIncluded() {
		return taxIncluded;
	}


	public void setTaxIncluded(boolean taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	 
	 
	
	
	
	
	
	
	
	
}
