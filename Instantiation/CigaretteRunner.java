package com.Instantiation.boot.Runner;
import com.Instantiation.boot.Cigarette;
public class CigaretteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cigarette smoke = new Cigarette();
		
		System.out.println(smoke.type); 
		System.out.println(smoke.brand); 
		System.out.println(smoke.company); 
		System.out.println(smoke.logo);
		System.out.println(smoke.location);
		System.out.println(smoke.price);    
		System.out.println(smoke.gst); 
		System.out.println(smoke.quantity); 
		System.out.println(smoke.quality); 
		
		System.out.println("*********////////////////**************");
		
		smoke. owner="R.J.Reynolds";
		smoke. chemicals="Hydrogen Cynide";
		smoke. productionQuality="Ultra-Premium";
		smoke. color="White";
		smoke. tobaccoQuantity=100.0;
		smoke. export="all over the world";
		smoke. originatedPlace="USA";
		smoke. brandAmbassader="Winston group and Company";
		smoke. discount=17;	
		
		System.out.println(smoke.owner);
		System.out.println(smoke.chemicals);
		System.out.println(smoke.productionQuality);
		System.out.println(smoke.color);
		System.out.println(smoke.tobaccoQuantity);
		System.out.println(smoke.export);
		System.out.println(smoke.originatedPlace);
		System.out.println(smoke.brandAmbassader);
		System.out.println(smoke.discount);
		
		
	   Cigarette property1 = new Cigarette();
	   property1.type="Black";
	   System.out.println(property1.type);
		
	}

}
