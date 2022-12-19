package com.source.dto;

import com.source.constant.Location;

public class PlaceDTO extends AbstractAuditDto{

	private String name;
	private String toursitName;
	private Location location;
	private int      ticketPrice;
	private int     noOfVisitors;
	public PlaceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", toursitName=" + toursitName + ", location=" + location + ", ticketPrice="
				+ ticketPrice + ", noOfVisitors=" + noOfVisitors + ", toString()=" + super.toString() + "]";
	}

	public PlaceDTO(String name, String toursitName, Location location, int ticketPrice, int noOfVisitors) {
		super();
		this.name = name;
		this.toursitName = toursitName;
		this.location = location;
		this.ticketPrice = ticketPrice;
		this.noOfVisitors = noOfVisitors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToursitName() {
		return toursitName;
	}

	public void setToursitName(String toursitName) {
		this.toursitName = toursitName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNoOfVisitors() {
		return noOfVisitors;
	}

	public void setNoOfVisitors(int noOfVisitors) {
		this.noOfVisitors = noOfVisitors;
	}
}
