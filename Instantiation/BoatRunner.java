package com.Instantiation.boot.Runner;
import com.Instantiation.boot.Boat;
public class BoatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boat ship = new Boat("Liberty","Black");
		System.out.println(ship.name);
		System.out.println(ship.color);
		
		Boat ship1 = new Boat("Red",'L');
		System.out.println(ship1.color);
		System.out.println(ship1.type);
		
		Boat ship2 = new Boat('M',"Aviansh");
		System.out.println(ship2.type);
		System.out.println(ship2.owner);
		
		Boat ship3 = new Boat("Sea ray",'X',"Liberty");
		System.out.println(ship3.companyName);
		System.out.println(ship3.type);	
		System.out.println(ship3.name);	
		
		Boat ship4 = new Boat('S',"RED","Assassin");
		System.out.println(ship4.type);
		System.out.println(ship4.color);
		System.out.println(ship4.owner);
		
		Boat ship5 = new Boat("Liberty","RED",'l');
		System.out.println(ship5.name);
		System.out.println(ship5.color);
		System.out.println(ship5.type);
		
		Boat ship6 = new Boat("Praveen","White","LIberty");
		System.out.println(ship6.owner);
		System.out.println(ship6.color);
		System.out.println(ship6.name);
		
		Boat ship7 = new Boat('M');
		System.out.println(ship7.type);
	}
	

}
