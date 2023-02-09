package com.source.dto;

import com.source.constant.Brand;

public class TheaterDTO extends AbstractAuditDto {

	private int id;
	private String name;
	private Brand brand;
    private int    noOfSeats;
    
	public TheaterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", noOfSeats=" + noOfSeats
				+ ", toString()=" + super.toString() + "]";
	}

	public TheaterDTO(int id, String name, Brand brand, int noOfSeats) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.noOfSeats = noOfSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
}
