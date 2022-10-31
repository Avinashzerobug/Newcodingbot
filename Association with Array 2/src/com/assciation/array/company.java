package com.assciation.array;

public class company {

	public String name;
	public String ownerNam;
	public Adress adress = new Adress();
	
	
	public void comp(String name, String ownerNam)
	{
		
		this.name = name;
		this.ownerNam = ownerNam;
		
	}
	
	
	public void displaySee()
	{
		if(adress!=null)
		{
			
			adress.display();
			
			
		}
		
		System.out.println("Company name and Owner Name");
        System.out.println("***************************");
		System.out.println(this.name);
		System.out.println(this.ownerNam);
		System.out.println(System.lineSeparator());
		

		
	}
	
	
	
	
	
}
