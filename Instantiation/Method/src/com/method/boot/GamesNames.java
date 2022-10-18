package com.method.boot;



public class GamesNames {
	
	     public String ubisoft;
	     public char   type;
	     public String uniralEngine;
	     public int    noOfGames;
	     public boolean gameForAdults;
	     public String[] allGames;
	     public String[] characterNames;
	     public String[] playersNames;
	     public double[] gamesPrice;
	     public long[]    noOfBuyers;
	     public String[] missions;
	     
	     
	     public GamesNames(String ubisoft,char type,String uniralEngine,int  noOfGames,boolean gameForAdults,String[] allGames,String[] characterNames,String[] playersNames,double[] gamesPrice,long[] noOfBuyers,String[] missions)
	     {
	    	 
	    	 this.ubisoft = ubisoft;
	    	 this.type = type;
	    	 this.uniralEngine = uniralEngine;
	    	 this.noOfGames = noOfGames;
	    	 this.gameForAdults = gameForAdults;
	    	 this.allGames = allGames;
	    	 this.characterNames = characterNames;
	    	 this.playersNames = playersNames;
	    	 this.gamesPrice = gamesPrice;;
	    	 this.noOfBuyers = noOfBuyers;
	    	 this.missions = missions;	    	     	 
	    	 
	     }
	
	
	     public void display()
	     {
	    	 
	    	 System.out.println(this.ubisoft);
	    	 System.out.println(this.type);
	    	 System.out.println(this.uniralEngine);
	    	 System.out.println(this.noOfGames);
	    	 System.out.println(this.gameForAdults);
	    	 
	    	 System.out.println(System.lineSeparator());
             System.out.println("Games Names");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < allGames.length; i++)
	    	 {
				
	    		 String play1 = this.allGames[i];
	    		 System.out.println(play1);	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("character Names");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < characterNames.length; i++) 	 
	    	 {
	    		 String play2 = this.characterNames[i];
	    		 System.out.println(play2);
		
			 
	    	 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("players Names");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < playersNames.length; i++)     	 
	    	 {
				String play3 = this.playersNames[i];
				System.out.println(play3);
	 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Games Price");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < gamesPrice.length; i++)
	    	 {
				double play4 = this.gamesPrice[i];
				System.out.println(play4);
	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("No Of Buyers");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < noOfBuyers.length; i++)
	    	 {
				long play5 = this.noOfBuyers[i];
				System.out.println(play5);
	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Missions");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < missions.length; i++) 
	    	 {
				String play6 = this.missions[i];
				System.out.println(play6);
	    		 
	    		 
			 }
	    	 
	    	
	    	 
	     }
	    

}
