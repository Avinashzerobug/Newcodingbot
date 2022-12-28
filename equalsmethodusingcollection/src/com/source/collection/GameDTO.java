package com.source.collection;

import java.io.Serializable;

public class GameDTO implements Serializable {

	
	
	private String name;
	private String version;
	private double price;
	
	public GameDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameDTO(String name, String version, double price) {
		super();
		this.name = name;
		this.version = version;
		this.price = price;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
		System.out.println("Starting the equals method:");
		if(obj!=null)
		{
			if(obj instanceof GameDTO)
			{
				GameDTO dto = (GameDTO)obj;
				if(dto.name.equals(this.name))
				{
					System.out.println("its a having a equal name:"+dto.name);
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
}
