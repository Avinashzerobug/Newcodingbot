package com.Instantiation.boot.Runner;
import com.Instantiation.boot.Chocolate;
public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chocolate yum = new Chocolate();
        System.out.println(yum.name);
        System.out.println(yum.brand);
        System.out.println(yum.price);
        System.out.println(yum.flavour);
        
        yum.name="Kinder Joy";
        yum.brand="Ferrero";
        yum.price=60;
        yum.flavour="Creamy Chocolate";
        
        System.out.println("Updated Chocolate name");
        
        System.out.println(yum.name);
        System.out.println(yum.brand);
        System.out.println(yum.price);
        System.out.println(yum.flavour);
		
		
		
	}

}
