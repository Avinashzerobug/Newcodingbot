package com.encapsulation.access;

public class StockAccess {
	
public	StockMarket stock;
	
	public void bear(StockMarket stock)
	{

		
		System.out.println(stock. getName());
		stock.setName("ZODIAC");
		System.out.println(stock. getName());
		
		System.out.println(stock. getNoOfInvest());
		stock.setNoOfInvest(761080);
		System.out.println(stock. getNoOfInvest());
		
		System.out.println(stock. getCompany());
		stock.setCompany("Tesla");
		System.out.println(stock. getCompany());
		
		System.out.println(stock. getNoOfYears());
		stock.setNoOfYears(1090);
		System.out.println(stock. getNoOfYears());
		
		System.out.println(stock. isProfit());
		stock.setProfit(false);
		System.out.println(stock. isProfit());
		
		System.out.println(stock. getRating());
		stock.setRating(120);
		System.out.println(stock.getRating());
		
		System.out.println(stock. getOwner());
		stock.setOwner("AMD");
		System.out.println(stock. getOwner());
		
		System.out.println(stock. getPresentRate());
		stock.setPresentRate("Poerfull");
		System.out.println(stock. getPresentRate());
		
		System.out.println(stock. getInterFace());
		stock.setInterFace(500);
		System.out.println(stock. getInterFace());
		
		System.out.println(stock. getSpeed());
		stock.setSpeed("Faster");
		System.out.println(stock);
		
		System.out.println(stock. getTiming());
		stock.setTiming("INTEL");
		System.out.println(stock. getTiming());
		
		
	}

}
