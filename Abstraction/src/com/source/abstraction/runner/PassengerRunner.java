package com.source.abstraction.runner;

import com.source.abstraction.Passenger;
import com.source.abstraction.overriding.Airport;
import com.source.abstraction.ruler.AirportAuthority;

public class PassengerRunner {

	 public static void main (String[] ark)
	 {
	
	Passenger passenger = new Airport();
	
	
	AirportAuthority airport = new AirportAuthority(passenger);
	
	airport.show();
	
}
}