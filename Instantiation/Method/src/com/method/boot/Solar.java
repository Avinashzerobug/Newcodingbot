package com.method.boot;

public class Solar {

	     public String    Planet;
	     public char      type;
	     public String    galaxyName;
	     public int       positionOfPlanet;
	     public boolean   livingExist ;
	     public String[]  planets;
	     public String[]  galaxies;
	     public String[]  naturalSatellite;
	     public double[]  planetsWeights;
	     public long[]    noNaturalSatellite;
	     public String[]  missions;
	
	
	public Solar(String Planet,char type,String galaxyName,int  positionOfPlanet,boolean livingExist,String[] planets,String[] galaxies,String[] naturalSatellite,double[] planetsWeights,long[] noNaturalSatellite,String[] missions)
	{
		
		 this.Planet = Planet;
    	 this.type = type;
    	 this.galaxyName = galaxyName;
    	 this.positionOfPlanet = positionOfPlanet;
    	 this.livingExist = livingExist;
    	 this.planets = planets;
    	 this.galaxies = galaxies;
    	 this.naturalSatellite = naturalSatellite;
    	 this.planetsWeights = planetsWeights;;
    	 this.noNaturalSatellite = noNaturalSatellite;
    	 this.missions = missions;	    
			
		
	}
	
	   public void display()
	     {
	    	 
	    	 System.out.println(this.Planet);
	    	 System.out.println(this.type);
	    	 System.out.println(this.galaxyName);
	    	 System.out.println(this.positionOfPlanet);
	    	 System.out.println(this.livingExist);
	    	 
	    	 System.out.println(System.lineSeparator());
           System.out.println("Planets");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < planets.length; i++)
	    	 {
				
	    		 String play1 = this.planets[i];
	    		 System.out.println(play1);	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Galaxies");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < galaxies.length; i++) 	 
	    	 {
	    		 String play2 = this.galaxies[i];
	    		 System.out.println(play2);
		
			 
	    	 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Natural Satellite");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < naturalSatellite.length; i++)     	 
	    	 {
				String play3 = this.naturalSatellite[i];
				System.out.println(play3);
	 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("Planets Weights");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < planetsWeights.length; i++)
	    	 {
				double play4 = this.planetsWeights[i];
				System.out.println(play4);
	    		 
	    		 
			 }
	    	 
	    	 System.out.println(System.lineSeparator());
	    	 System.out.println("No of Natural Satellite");
	    	 System.out.println("*******************************");
	    	 
	    	 for (int i = 0; i < noNaturalSatellite.length; i++)
	    	 {
				long play5 = this.noNaturalSatellite[i];
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
