package com.Instantiation.boot.Runner;
import com.Instantiation.boot.RMD;
public class RMDRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RMD kesaraDum = new RMD();
		System.out.println(kesaraDum.type); 
		System.out.println(kesaraDum.brand);
		System.out.println(kesaraDum.company); 
		System.out.println(kesaraDum.logo); 
		System.out.println(kesaraDum.location); 
		System.out.println(kesaraDum.price);   
		System.out.println(kesaraDum.gst);
		System.out.println(kesaraDum.quantity); 
		System.out.println(kesaraDum.quality); 
		
		System.out.println("////////////*********/////////////");
		
		kesaraDum. owner="R.S.Munirathinam";
		kesaraDum. chemicals="cyclooctane";
		kesaraDum. productionQuality="Standard level";
		kesaraDum. color="RED";
		kesaraDum. tobaccoQuantity=45.5;
		kesaraDum. export="All over India";
		kesaraDum. originatedPlace="Karnataka";
		kesaraDum. brandAmbassader=" Moiz Miya";
		kesaraDum. discount=20;	
		
    	System.out.println(kesaraDum. owner);
		System.out.println(kesaraDum. chemicals);
		System.out.println(kesaraDum. productionQuality);
		System.out.println(kesaraDum. color);
		System.out.println(kesaraDum. tobaccoQuantity);
		System.out.println(kesaraDum. export);
		System.out.println(kesaraDum. originatedPlace);
		System.out.println(kesaraDum. brandAmbassader);
		System.out.println(kesaraDum. discount);	
		
		RMD kesarkaDum1 = new RMD();
		kesarkaDum1.color = "white";
		System.out.println(kesarkaDum1.color);
         

	}

}
