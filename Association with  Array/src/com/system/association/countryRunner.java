package com.system.association;
public class countryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country country = new Country("India");
		President president = new President("Droupadi Murmu");
		
		president.setGender(Gender.FEMALE);
		
        country.setPresident(president);
		
		Name name1 = new Name("Ramnath kovind","Pratibha Patil","Pranav Mukharji");
		City city1 = new City(name1,true,4355.5);
		
	
		
		Name name2 = new Name("Drupati Murmu","APG Abdul Kalam",null);
		
		City city2 = new City(name2,false,46456.35);
		
		
		City[] cit = {city1,city2};
		country.setCities(cit);
		
		country.letMeSee();
		

	
		
	}

}
