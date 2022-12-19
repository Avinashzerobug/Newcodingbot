package com.source.dto;

import com.source.constant.Rooms;

public class BuildingDTO extends AbstractAuditDto {

	
	private String name;
	private String location;
	private Rooms  roomName;
	private int   floors;
	private boolean lift;
	
	public BuildingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BuildingDTO [name=" + name + ", location=" + location + ", roomName=" + roomName + ", floors=" + floors
				+ ", lift=" + lift + ", toString()=" + super.toString() + "]";
	}

	public BuildingDTO(String name, String location, Rooms roomName, int floors, boolean lift) {
		super();
		this.name = name;
		this.location = location;
		this.roomName = roomName;
		this.floors = floors;
		this.lift = lift;
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

	public Rooms getRoomName() {
		return roomName;
	}

	public void setRoomName(Rooms roomName) {
		this.roomName = roomName;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}
	
	
}

