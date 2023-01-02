package com.source.dto;

import java.io.Serializable;

public class DataBaseVendorDTO implements Serializable {

	private String name;
	private String developedBy;
	private Type   type; 
	private double size;
	private double lisenceCost;
	
	public DataBaseVendorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDTO(String name, String developedBy, Type type, double size, double lisenceCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.lisenceCost = lisenceCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", lisenceCost=" + lisenceCost + "]";
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
		if(obj instanceof DataBaseVendorDTO)
		{
			DataBaseVendorDTO dto = (DataBaseVendorDTO)obj;
			System.out.println(dto);
			return true;
			
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLisenceCost() {
		return lisenceCost;
	}

	public void setLisenceCost(double lisenceCost) {
		this.lisenceCost = lisenceCost;
	}
	
	
	
	
	
	
	
	
	
	
	
}
