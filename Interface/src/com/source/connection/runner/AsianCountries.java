package com.source.connection.runner;

import com.source.connection.CountryInfo;

public class AsianCountries implements CountryInfo {

	@Override
	public String countryName() {
		System.out.println("INDIA");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfCountries() {
		System.out.println("in asia 47 countries are there");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long population() {
		System.out.println("Population:"+1300000000l);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long highestPopulation() {
		System.out.println("Highest population:"+"China");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String pMName() {
		System.out.println("India pm name:"+"Narendra Modi");
		// TODO Auto-generated method stub
		return null;
	}

}






