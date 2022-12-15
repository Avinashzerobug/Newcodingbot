package com.source.dto;

import com.source.constant.Color;

public class HelmetDTO extends AbstractAuditDto {
	
	private String type;
	private String name;
	private Double price;
	private Color  color;
	

	public HelmetDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public HelmetDTO(String type, String name, Double price, Color color) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
		this.color = color;
	}



	@Override
	public String toString() {
		return "HelmetDTO [type=" + type + ", name=" + name + ", price=" + price + ", color=" + color + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	

}
