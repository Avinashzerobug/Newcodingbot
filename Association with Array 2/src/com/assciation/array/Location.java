package com.assciation.array;

public class Location {

	public int no;
	public String street;
	public City city = new City();
	public State state = new State();
	public Country country = new Country();
	
	
	
	
	
	public void locate(String street,int no)
	{
		this.no = no;
		this.street = street;
	
	}
	
	
	
	public void showUs()
	{
		if(city!=null&&state!=null&&country!=null)
		{
			 city.city("Benda Kalur","Bangalore",30000000L,true);
				state.stay("Karnataka","INDIA",50006,19179);
				country.count(534255355L,"RUSSIA","MOSCOW","Vladmir Putin");
				city.show();
				country.see();
				state.showMe();
		} 
		
		else
		{
			System.out.println("Welcome to the Null world");
		}
		
		System.out.println("Street Name and street number");
		System.out.println("*****************************");
		System.out.println(this.no);
		System.out.println(this.street);
		System.out.println(System.lineSeparator());
		
	}
	
	
	
	
	
	
	
}
