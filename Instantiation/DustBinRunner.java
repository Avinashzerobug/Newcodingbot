package com.Instantiation.boot.Runner;
import  com.Instantiation.boot.Dustbin;
public class DustBinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dustbin swachBharat = new Dustbin();
		
		System.out.println(swachBharat.type);
		System.out.println(swachBharat.brand);
		System.out.println(swachBharat.company);
		System.out.println(swachBharat.logo);
		System.out.println(swachBharat.location);
		System.out.println(swachBharat.price);
		System.out.println(swachBharat.capacity);
		System.out.println(swachBharat.quality);
		System.out.println(swachBharat.gst);
		
		System.out.println("//////////////************////////////////");
		
		swachBharat.owner="Ingvar Kamprad";
		swachBharat.chemicals="Ethidium Bromide";
		swachBharat.productionQuality="HIgh Standard Level";
		swachBharat.color="Black";
		swachBharat.design="Cylindrical Shape";
		swachBharat.export="ALL over world";
		swachBharat.originatedPlace="Delft, Netherlands";
		swachBharat.brandAmbassader="Amitabh Pande";
		swachBharat.discount=50;	
		
	    System.out.println (swachBharat.owner);
	    System.out.println (swachBharat.chemicals);
	    System.out.println (swachBharat.productionQuality);
	    System.out.println (swachBharat.color);
	    System.out.println (swachBharat.design);
	    System.out.println (swachBharat.export);
	    System.out.println (swachBharat.originatedPlace);
	    System.out.println (swachBharat.brandAmbassader);
	    System.out.println (swachBharat.discount);	
		
		
		Dustbin swachBharat1 = new Dustbin();	
		swachBharat1.color = "RED";
		System.out.println(swachBharat1.color);
			
	}

}
