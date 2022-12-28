package com.source.collection;

import java.io.Serializable;

public class PlaceDTO implements Serializable {

	private String name;
	private String famousFor;
	private String countryName;
	
	public PlaceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlaceDTO(String name, String famousFor, String countryName) {
		super();
		this.name = name;
		this.famousFor = famousFor;
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", famousFor=" + famousFor + ", countryName=" + countryName + "]";
	}
	
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof PlaceDTO)
			{
				PlaceDTO dto = (PlaceDTO)obj;
				if(dto.countryName.equals(this.countryName))
				{
					System.out.println("its a having same country name:"+this.countryName);
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

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
