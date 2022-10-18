package com.method.boot;

public class WebSeries {

	     public String    name;
	     public char      type;
	     public String    actorName;
	     public int       noOfActors;
	     public boolean   hit ;
	     public String[]  seriesName;
	     public String[]  episodeNames;
	     public String[]  characterNames;
	     public double[]  budget;
	     public long[]    noOfSeasons;
	     public String[]  musicNames;
	     
	     
	     public WebSeries(String name,char type,String actorName,int  noOfActors,boolean hit,String[] seriesName,String[] episodeNames,String[] characterNames,double[] budget,long[] noOfSeasons,String[] musicNames) 
	     {
	    	 this.name = name;
	    	 this.type = type;
	    	 this.actorName = actorName;
	    	 this.noOfActors = noOfActors;
	    	 this.hit = hit;
	    	 this.seriesName = seriesName;
	    	 this.episodeNames = episodeNames;
	    	 this.characterNames = characterNames;
	    	 this.budget = budget;;
	    	 this.noOfSeasons = noOfSeasons;
	    	 this.musicNames = musicNames;	    
				    	 
	    	 
	     }
	
	     public void display()
	     {
	    	 
	    	 System.out.println(this.name);
	    	 System.out.println(this.type);
	    	 System.out.println(this.actorName);
	    	 System.out.println(this.noOfActors);
	    	 System.out.println(this.hit);
	    	 
	    	 System.out.println(System.lineSeparator());
           System.out.println("Series Name");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < seriesName.length; i++)
	    	 {
				
	    		 String play1 = this.seriesName[i];
	    		 System.out.println(play1);	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("No Of Actors");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < episodeNames.length; i++) 	 
	    	 {
	    		 String play2 = this.episodeNames[i];
	    		 System.out.println(play2);
		
			 
	    	 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Character Names");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < characterNames.length; i++)     	 
	    	 {
				String play3 = this.characterNames[i];
				System.out.println(play3);
	 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Budget");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < budget.length; i++)
	    	 {
				double play4 = this.budget[i];
				System.out.println(play4);
	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("No Of Seasonse");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < noOfSeasons.length; i++)
	    	 {
				long play5 = this.noOfSeasons[i];
				System.out.println(play5);
	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Music Names");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < musicNames.length; i++) 
	    	 {
				String play6 = this.musicNames[i];
				System.out.println(play6);
	    		 
	    		 
			 }
	    	 
	    	
	    	 
	     }
	
	
	
	
	
	
	
	
	
	
}
