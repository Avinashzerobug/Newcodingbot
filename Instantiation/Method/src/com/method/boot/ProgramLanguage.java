package com.method.boot;

public class ProgramLanguage {

	    public String    name;
	    public String    type; 
	    public String    invented;
	    public int       types;
	    public boolean   freeToUse;
	    public String[]  placeNames;
	    public String[]  placeLocation;
	    public String[]  members;
	    public double[]  price;
	    public long[]    totalUserOtherCountry;
	    public String[]  countryNames;
	    
	    public ProgramLanguage(String name,String type,String invented,int  types,boolean freeToUse,String[] placeNames,String[] placeLocation,String[] members,double[] price,long[] totalUserOtherCountry,String[] countryNames)
	    
	    
	    {
	   	 this.name = name;
	   	 this.type = type;
	   	 this.invented = invented;
	   	 this.types = types;
	   	 this.freeToUse = freeToUse;
	   	 this.placeNames = placeNames;
	   	 this.placeLocation = placeLocation;
	   	 this.members = members;
	   	 this.price = price;;
	   	 this.totalUserOtherCountry = totalUserOtherCountry;
	   	 this.countryNames = countryNames;	    
				    	 
	   	 
	    }
	  


     public void display()
{
	 
	 System.out.println(this.name);
	 System.out.println(this.type);
	 System.out.println(this.invented);
	 System.out.println(this.types);
	 System.out.println(this.freeToUse);
	 
	 System.out.println(System.lineSeparator());
   System.out.println(" Names");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < placeNames.length; i++)
	 {
		
		 String play1 = this.placeNames[i];
		 System.out.println(play1);	    		 
		 
	 }
	 
	 System.out.println(System.lineSeparator());
	 System.out.println(" Location ");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < placeLocation.length; i++) 	 
	 {
		 String play2 = this.placeLocation[i];
		 System.out.println(play2);

	 
	 }
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Members");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < members.length; i++)     	 
	 {
		String play3 = this.members[i];
		System.out.println(play3);

	 }
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Price");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < price.length; i++)
	 {
		double play4 = this.price[i];
		System.out.println(play4);
		 
		 
	 }
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Total User Other Country");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < totalUserOtherCountry.length; i++)
	 {
		long play5 = this.totalUserOtherCountry[i];
		System.out.println(play5);
		 
		 
	 }
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Country Names");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < countryNames.length; i++) 
	 {
		String play6 = this.countryNames[i];
		System.out.println(play6);
		 
		 
	 }
	
	
	
	
	
	
	
	
}
	
}
