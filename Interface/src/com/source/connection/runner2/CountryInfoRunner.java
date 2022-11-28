package com.source.connection.runner2;

import com.source.connection.CountryInfo;
import com.source.connection.runner.AsianCountries;

public class CountryInfoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountryInfo country = new AsianCountries();
		CountryInfo country2 = new AsianCountries();
		
		country.countryName();
		country2.highestPopulation();
		country.noOfCountries();
		country.pMName();
		country2.population();
		
	
	}

}
