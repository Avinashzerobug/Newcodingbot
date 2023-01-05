package com.source.dto;

import java.io.Serializable;

import com.source.constant.Type;

public class WeaponDTO implements Serializable,Comparable {
	
	
	private String name;
	private String madeBy;
	private String madeOn;
	private double price;
	private Type  type;
	
	public WeaponDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, String madeOn, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int compareTo(Object o) {
		  this.name.compareTo(getName());
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof WeaponDTO)
			{
				WeaponDTO dto = (WeaponDTO)obj;
			  if(this.name.equals(dto.name))
			  {
				  System.out.println("same name:"+this.name);
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

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
	
	

}
