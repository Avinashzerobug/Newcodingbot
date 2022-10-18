package com.method.boot;

public class TallestBuildings {

	    public String    name;
	    public String    type; 
	    public String    Architectur;
	    public int       noOfBuildings;
	    public boolean   isTheySafe;
	    public String[]  typesOfBuildings;
	    public String[]  typesOfdesigns;
	    public String[]  typesOfBuilders;
	    public double[]  area;
	    public long[]    priceOfTheBuilding;
	    public String[]  countryNames;

	    public TallestBuildings(String name,String type,String Architectur,int  noOfBuildings,boolean isTheySafe,String[] typesOfBuildings,String[] typesOfdesigns,String[] typesOfBuilders,double[] area,long[] priceOfTheBuilding,String[] countryNames)
	    {
	   	 this.name = name;
	   	 this.type = type;
	   	 this.Architectur = Architectur;
	   	 this.noOfBuildings = noOfBuildings;
	   	 this.isTheySafe = isTheySafe;
	   	 this.typesOfBuildings = typesOfBuildings;
	   	 this.typesOfdesigns = typesOfdesigns;
	   	 this.typesOfBuilders = typesOfBuilders;
	   	 this.area = area;
	   	 this.priceOfTheBuilding = priceOfTheBuilding;
	   	 this.countryNames = countryNames;	    
				    	 
	    }
	


	    public void display()
	{
		 
		 System.out.println(this.name);
		 System.out.println(this.type);
		 System.out.println(this.Architectur);
		 System.out.println(this.noOfBuildings);
		 System.out.println(this.isTheySafe);
		 
		 System.out.println(System.lineSeparator());
	  System.out.println("typesOfBuildings");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < typesOfBuildings.length; i++)
		 {
			
			 String play1 = this.typesOfBuildings[i];
			 System.out.println(play1);	    		 
			 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println(" typesOfdesigns ");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < typesOfdesigns.length; i++) 	 
		 {
			 String play2 = this.typesOfdesigns[i];
			 System.out.println(play2);

		 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("typesOfBuilders");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < typesOfBuilders.length; i++)     	 
		 {
			String play3 = this.typesOfBuilders[i];
			System.out.println(play3);

		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("area");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < area.length; i++)
		 {
			double play4 = this.area[i];
			System.out.println(play4);
			 
			 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("priceOfTheBuildings");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < priceOfTheBuilding.length; i++)
		 {
			long play5 = this.priceOfTheBuilding[i];
			System.out.println(play5);
			 
			 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("countryNames");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < countryNames.length; i++) 
		 {
			String play6 = this.countryNames[i];
			System.out.println(play6);
			 
			 
		 }
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
