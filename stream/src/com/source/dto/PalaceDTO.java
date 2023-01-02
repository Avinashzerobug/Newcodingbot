package com.source.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable {

	
	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private double visitingFees;
	
	public PalaceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null)
		{
			if(obj instanceof PalaceDTO)
			{
			  PalaceDTO dto = (PalaceDTO)obj;
			  if(dto.name.equals(this.name))
			  {
				  System.out.println("names are equals :"+this.name);
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}
	
	
	
	
	
	
	
	
	
	
}
