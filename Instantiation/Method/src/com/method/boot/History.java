package com.method.boot;

public class History {

	    public String    kingName;
	    public String    queenName; 
	    public String    writer;
	    public int       Soldiers;
	    public boolean   theKingIsDead;
	    public String[]  hisCommanders;
	    public String[]  writerNames;
	    public String[]  typesOfFlags;
	    public double[]  hisProperty;
	    public long[]    typesOfSoldiers;
	    public String[]  wars;
		
	    public History(String kingName,String queenName,String writer,int  Soldiers,boolean theKingIsDead,String[] hisCommanders,String[] writerNames,String[] typesOfFlags,double[] hisProperty,long[] typesOfSoldiers,String[] wars)
	    {
	   	 this.kingName = kingName;
	   	 this.queenName = queenName;
	   	 this.writer = writer;
	   	 this.Soldiers = Soldiers;
	   	 this.theKingIsDead = theKingIsDead;
	   	 this.hisCommanders = hisCommanders;
	   	 this.writerNames = writerNames;
	   	 this.typesOfFlags = typesOfFlags;
	   	 this.hisProperty = hisProperty;
	   	 this.typesOfSoldiers = typesOfSoldiers;
	   	 this.wars = wars;	    
				    	 
	    }
	


	    public void display()
	{
		 
		 System.out.println(this.kingName);
		 System.out.println(this.queenName);
		 System.out.println(this.writer);
		 System.out.println(this.Soldiers);
		 System.out.println(this.theKingIsDead);
		 
		 System.out.println(System.lineSeparator());
	  System.out.println("His Commanders");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < hisCommanders.length; i++)
		 {
			
			 String play1 = this.hisCommanders[i];
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
		 System.out.println("Types Of Flags");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < typesOfFlags.length; i++)     	 
		 {
			String play3 = this.typesOfFlags[i];
			System.out.println(play3);

		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("His Property");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < hisProperty.length; i++)
		 {
			double play4 = this.hisProperty[i];
			System.out.println(play4);
			 
			 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("Types Of Soldiers");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < typesOfSoldiers.length; i++)
		 {
			long play5 = this.typesOfSoldiers[i];
			System.out.println(play5);
			 
			 
		 }
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("wars");
		 System.out.println("*******************************");
		 
		 for (int i = 0; i < wars.length; i++) 
		 {
			String play6 = this.wars[i];
			System.out.println(play6);
			 
			 
		 }
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
