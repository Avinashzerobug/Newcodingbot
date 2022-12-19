package com.source.dto;

public class BakeryDTO extends AbstractAuditDto {
	
	private String name;
	private String ownerName;
	private String location;
	private String famousFor;
	private long contactNo;
	
	
	public BakeryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", location=" + location + ", famousFor="
				+ famousFor + ", contactNo=" + contactNo + ", toString()=" + super.toString() + "]";
	}


	public BakeryDTO(String name, String ownerName, String location, String famousFor, long contactNo) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.famousFor = famousFor;
		this.contactNo = contactNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getFamousFor() {
		return famousFor;
	}


	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	

	
	
}
