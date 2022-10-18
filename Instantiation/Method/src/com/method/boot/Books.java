package com.method.boot;

public class Books {

	    public String    name;
	    public String    type; 
	    public String    writer;
	    public int       types;
	    public boolean   freeToWrite;
	    public String[]  typesOfBooks;
	    public String[]  writerNames;
	    public String[]  typesOfDesign;
	    public double[]  price;
	    public long[]    totalStudentsUsedBooks;
	    public String[]  countryMostBookUsed;
		
	
		
	    public Books(String name,String type,String writer,int  types,boolean freeToWrite,String[] typesOfBooks,String[] writerNames,String[] typesOfDesign,double[] price,long[] totalStudentsUsedBooks,String[] countryMostBookUsed)
	    {
	   	 this.name = name;
	   	 this.type = type;
	   	 this.writer = writer;
	   	 this.types = types;
	   	 this.freeToWrite = freeToWrite;
	   	 this.typesOfBooks = typesOfBooks;
	   	 this.writerNames = writerNames;
	   	 this.typesOfDesign = typesOfDesign;
	   	 this.price = price;
	   	 this.totalStudentsUsedBooks = totalStudentsUsedBooks;
	   	 this.countryMostBookUsed = countryMostBookUsed;	    
				    	 
	    }
	
	

	    public void display()
	{
		 
		 System.out.println(this.name);
		 System.out.println(this.type);
		 System.out.println(this.writer);
		 System.out.println(this.types);
		 System.out.println(this.freeToWrite);
		 
		 System.out.println(System.lineSeparator());
	  System.out.println("Types Of Books");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < typesOfBooks.length; i++)
		 {
			
			 String play1 = this.typesOfBooks[i];
			 System.out.println(play1);	    		 
			 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println(" Writer Names ");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < writerNames.length; i++) 	 
		 {
			 String play2 = this.writerNames[i];
			 System.out.println(play2);

		 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("Types Of Design");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < typesOfDesign.length; i++)     	 
		 {
			String play3 = this.typesOfDesign[i];
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
		 System.out.println("Total Students Used Books");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < totalStudentsUsedBooks.length; i++)
		 {
			long play5 = this.totalStudentsUsedBooks[i];
			System.out.println(play5);
			 
			 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("country Most Book Used");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < countryMostBookUsed.length; i++) 
		 {
			String play6 = this.countryMostBookUsed[i];
			System.out.println(play6);
			 
			 
		 }
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
