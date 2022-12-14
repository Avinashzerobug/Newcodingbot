package com.source.dto;

import java.time.LocalDateTime;

import com.source.constant.PizzaSize;

public class PizzaDTO extends AbstractAuditDto {

	private String name;
	private String company;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	private String Flavour;
	private String type;
	

	public PizzaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", Flavour=" + Flavour + ", type=" + type + ", toString()=" + super.toString() + "]";
	}


	


	public PizzaDTO(String createdby, LocalDateTime localDateTime, String updatedBy, LocalDateTime updatedDateTime) {
		super(createdby, localDateTime, updatedBy, updatedDateTime);
		// TODO Auto-generated constructor stub
	}






	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public PizzaSize getSize() {
		return size;
	}


	public void setSize(PizzaSize size) {
		this.size = size;
	}


	public boolean isCheese() {
		return cheese;
	}


	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getFlavour() {
		return Flavour;
	}


	public void setFlavour(String flavour) {
		Flavour = flavour;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
	
}
