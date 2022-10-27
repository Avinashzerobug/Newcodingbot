package com.association.boot.associating.custom;
import com.association.boot.associating.custom.God;
public class Temple {

	
	public String name;
	public String mainPriest;
	public long   noOfVisitors;
	public long   collectionPerDay;
	public God ref = new God();
	
	public Temple()
	{
		
	}
	
	public void namaste(String name,String mainPriest,long noOfVisitors,long collectionPerDay)
	{
		this.name = name;
		this.mainPriest=mainPriest;
		this.noOfVisitors=noOfVisitors;
		this.collectionPerDay=collectionPerDay;
		
		if(ref!=null)
		{
			
			ref.god("SHIVS","MALE","DESTROYER");
			
		}
		else
		{
			System.out.println("Welcome to the Null World");
		}
		
	}
	
	public void showoff()
	{
		
		
		System.out.println(this.name);
		System.out.println(this.mainPriest);
		System.out.println(this.noOfVisitors);
		System.out.println(this.collectionPerDay);
		System.out.println("************************************");
		 System.out.println("God Details");
		 System.out.println(System.lineSeparator());
	    ref.display();
		
	}
	
	
}
