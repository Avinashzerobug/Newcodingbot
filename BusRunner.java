package com.Instantiation.boot.Runner;

import com.Instantiation.boot.Bus;

public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				// TODO Auto-generated method stub
		        
			Bus bus1 = new Bus();
				System.out.println(bus1.starting);
				System.out.println(bus1.destination);
				System.out.println(bus1.busNo);	
				
				bus1.starting="Bagalkot";
				bus1.destination="Bangalore";
				bus1.busNo=8055;
				
				System.out.println(bus1.starting);
				System.out.println(bus1.destination);
				System.out.println(bus1.busNo);
			}	

}
