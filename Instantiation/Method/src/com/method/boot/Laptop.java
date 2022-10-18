package com.method.boot;

public class Laptop {

	

    public String    name;
    public String    type; 
    public String    invented;
    public int       types;
    public boolean   freeToUse;
    public String[]  typesOfLaptop;
    public String[]  typesOfOperatingSystems;
    public String[]  typesOfFolders;
    public double[]  price;
    public long[]    totalUserOtherCountry;
    public String[]  countryNames;
    
    public Laptop(String name,String type,String invented,int  types,boolean freeToUse,String[] typesOfLaptop,String[] typesOfOperatingSystems,String[] typesOfFolders,double[] price,long[] totalUserOtherCountry,String[] countryNames)
    {
   	 this.name = name;
   	 this.type = type;
   	 this.invented = invented;
   	 this.types = types;
   	 this.freeToUse = freeToUse;
   	 this.typesOfLaptop = typesOfLaptop;
   	 this.typesOfOperatingSystems = typesOfOperatingSystems;
   	 this.typesOfFolders = typesOfFolders;
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
  System.out.println(" Types Of Laptop");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < typesOfLaptop.length; i++)
	 {
		
		 String play1 = this.typesOfLaptop[i];
		 System.out.println(play1);	    		 
		 
	 }
	 
	 System.out.println(System.lineSeparator());
	 System.out.println(" Types Of Operating Systems ");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < typesOfOperatingSystems.length; i++) 	 
	 {
		 String play2 = this.typesOfOperatingSystems[i];
		 System.out.println(play2);

	 
	 }
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Types Of Folders");
	 System.out.println("*******************************");
	 
	 for (int i = 0; i < typesOfFolders.length; i++)     	 
	 {
		String play3 = this.typesOfFolders[i];
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
