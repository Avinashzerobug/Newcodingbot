package com.method.boot;

public class AutoMobile {

	     public String    name;
	     public char      type;
	     public String    cars;
	     public int       noOfCars;
	     public boolean   topEnd ;
	     public String[]  carsName;
	     public String[]  companyLocation;
	     public String[]  carsLogo;
	     public double[]  price;
	     public long[]    totalVehicleDelivered;
	     public String[]  companyOwnersName;
	     
	
	     public AutoMobile(String name,char type,String cars,int  noOfCars,boolean topEnd,String[] carsName,String[] companyLocation,String[] carsLogo,double[] price,long[] totalVehicleDelivered,String[] companyOwnersName)
	     
	     {
	    	 this.name = name;
	    	 this.type = type;
	    	 this.cars = cars;
	    	 this.noOfCars = noOfCars;
	    	 this.topEnd = topEnd;
	    	 this.carsName = carsName;
	    	 this.companyLocation = companyLocation;
	    	 this.carsLogo = carsLogo;
	    	 this.price = price;;
	    	 this.totalVehicleDelivered = totalVehicleDelivered;
	    	 this.companyOwnersName = companyOwnersName;	    
				    	 
	    	 
	     }
	
	     public void display()
	     {
	    	 
	    	 System.out.println(this.name);
	    	 System.out.println(this.type);
	    	 System.out.println(this.cars);
	    	 System.out.println(this.noOfCars);
	    	 System.out.println(this.topEnd);
	    	 
	    	 System.out.println(System.lineSeparator());
            System.out.println("Cars Name");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < carsName.length; i++)
	    	 {
				
	    		 String play1 = this.carsName[i];
	    		 System.out.println(play1);	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Company Location ");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < companyLocation.length; i++) 	 
	    	 {
	    		 String play2 = this.companyLocation[i];
	    		 System.out.println(play2);
		
			 
	    	 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Cars Logo");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < carsLogo.length; i++)     	 
	    	 {
				String play3 = this.carsLogo[i];
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
	    	 System.out.println("Total Vehicle Delivered");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < totalVehicleDelivered.length; i++)
	    	 {
				long play5 = this.totalVehicleDelivered[i];
				System.out.println(play5);
	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Company Owners Name");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < companyOwnersName.length; i++) 
	    	 {
				String play6 = this.companyOwnersName[i];
				System.out.println(play6);
	    		 
	    		 
			 }
	    	 
	    	
	    	 
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
