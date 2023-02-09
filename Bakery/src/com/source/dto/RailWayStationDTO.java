package com.source.dto;

import com.source.constant.Area;

public class RailWayStationDTO extends AbstractAuditDto   {

	private String name;
	private int   noOfPlatForms;
	private Area area;
	private double ticketPrice;
	
	public RailWayStationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "RailWayStationDTO [name=" + name + ", noOfPlatForms=" + noOfPlatForms + ", area=" + area
				+ ", ticketPrice=" + ticketPrice + ", toString()=" + super.toString() + "]";
	}


	public RailWayStationDTO(String name, int noOfPlatForms, Area area, double ticketPrice) {
		super();
		this.name = name;
		this.noOfPlatForms = noOfPlatForms;
		this.area = area;
		this.ticketPrice = ticketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatForms() {
		return noOfPlatForms;
	}

	public void setNoOfPlatForms(int noOfPlatForms) {
		this.noOfPlatForms = noOfPlatForms;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
}
