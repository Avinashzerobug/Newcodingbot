package com.source.collection;

import java.io.Serializable;

public class AirportDTO implements Serializable {

	
	private String name;
    private int    noOfAeroPalnes;
    private String location;
    
    
	public AirportDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AirportDTO(String name, int noOfAeroPalnes, String location) {
		super();
		this.name = name;
		this.noOfAeroPalnes = noOfAeroPalnes;
		this.location = location;
	}


	@Override
	public String toString() {
		return "AirpotDTO [name=" + name + ", noOfAeroPalnes=" + noOfAeroPalnes + ", location=" + location + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof AirportDTO)
			{
				AirportDTO dto = (AirportDTO)obj;
				if(dto.location.equals(this.location))
				{
					System.out.println("Its having the same location:"+dto.location);
					return true;
				}
			}
		}
		return false;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfAeroPalnes() {
		return noOfAeroPalnes;
	}


	public void setNoOfAeroPalnes(int noOfAeroPalnes) {
		this.noOfAeroPalnes = noOfAeroPalnes;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
