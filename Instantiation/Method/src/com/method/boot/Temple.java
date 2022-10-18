package com.method.boot;

public class Temple {

	
    public String    name;
    public char      type;
    public String    place;
    public int       noOfPlace;
    public boolean   correctLocation ;
    public String[]  placeNames;
    public String[]  placeLocation;
    public String[]  members;
    public double[]  price;
    public long[]    totalTouristVisited;
    public String[]  countryNames;
    

    public Temple(String name,char type,String place,int  noOfPlace,boolean correctLocation,String[] placeNames,String[] placeLocation,String[] members,double[] price,long[] totalTouristVisited,String[] countryNames)
    
    
    {
   	 this.name = name;
   	 this.type = type;
   	 this.place = place;
   	 this.noOfPlace = noOfPlace;
   	 this.correctLocation = correctLocation;
   	 this.placeNames = placeNames;
   	 this.placeLocation = placeLocation;
   	 this.members = members;
   	 this.price = price;;
   	 this.totalTouristVisited = totalTouristVisited;
   	 this.countryNames = countryNames;	    
			    	 
   	 
    }
    

    public void display()
    {
   	 
   	 System.out.println(this.name);
   	 System.out.println(this.type);
   	 System.out.println(this.place);
   	 System.out.println(this.noOfPlace);
   	 System.out.println(this.correctLocation);
   	 
   	 System.out.println(System.lineSeparator());
       System.out.println("Place Names");
   	 System.out.println("*******************************");
   	 
   	 for (int i = 0; i < placeNames.length; i++)
   	 {
			
   		 String play1 = this.placeNames[i];
   		 System.out.println(play1);	    		 
   		 
		 }
   	 
   	 System.out.println(System.lineSeparator());
   	 System.out.println("Place Location ");
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
   	 System.out.println("Total Tourist Visited");
   	 System.out.println("*******************************");
   	 
   	 for (int i = 0; i < totalTouristVisited.length; i++)
   	 {
			long play5 = this.totalTouristVisited[i];
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
