package com.Instantiation.boot.Runner;
import com.Instantiation.boot.Tea;
public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tea property = new Tea();
		System.out.println(property.brand);
		System.out.println(property.type);
		System.out.println(property.company);
		System.out.println(property.logo);
		System.out.println(property.location);
		System.out.println(property.price);
		System.out.println(property.gst);
		System.out.println(property.quantity);
		System.out.println(property.quality);
		
		System.out.println("/////////////////******///////////////////");
		
		property.owner="Ratan Tata";
		property.chemicals="Catechin";
		property.productionQuality="Good";
		property.color="Light Black";
		property.caffeineQuantity=0.0;
		property.export="all over country";
		property.originatedPlace="Uttarakhand";
		property.brandAmbassader="Tata group";
		property.discount=20;
		
		System.out.println(property.owner);
		System.out.println(property.chemicals);
		System.out.println(property.productionQuality);
		System.out.println(property.color);
		System.out.println(property.caffeineQuantity);
		System.out.println(property.export);
		System.out.println(property.originatedPlace);
		System.out.println(property.brandAmbassader);
		System.out.println(property.discount);
		
		Tea property1 = new Tea();
		property1.brand = "Nestley";
		System.out.println(property1.brand);
		
		
		
	}

}
