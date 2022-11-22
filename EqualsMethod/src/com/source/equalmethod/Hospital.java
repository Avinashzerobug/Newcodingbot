package com.source.equalmethod;

public class Hospital {


	private String name;
	private int    noOfStudents;
	private String principalName;
	private String Chairmen;
	private int    noOfStaffs;
	private String location;
	private double fee;
	private String fundsName;
	private String topperName;
	private String doctorName;
	
	public Hospital(String name, int noOfStudents, String principalName, String chairmen, int noOfStaffs,
			String location, double fee, String fundsName, String topperName, String doctorName) {
		super();
		this.name = name;
		this.noOfStudents = noOfStudents;
		this.principalName = principalName;
		Chairmen = chairmen;
		this.noOfStaffs = noOfStaffs;
		this.location = location;
		this.fee = fee;
		this.fundsName = fundsName;
		this.topperName = topperName;
		this.doctorName = doctorName;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", noOfStudents=" + noOfStudents + ", principalName=" + principalName
				+ ", Chairmen=" + Chairmen + ", noOfStaffs=" + noOfStaffs + ", location=" + location + ", fee=" + fee
				+ ", fundsName=" + fundsName + ", topperName=" + topperName + ", doctorName=" + doctorName + "]";
	}
	
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Hospital)
		{
			Hospital hospital = (Hospital)obj;
			if(this.name.equals(hospital.name)&&this.principalName.equals(hospital.principalName)&&this.Chairmen.equals(hospital.Chairmen)&&this.location.equals(hospital.location)&&this.fundsName.equals(hospital.fundsName)&&this.doctorName.equals(hospital.doctorName))
			{
				System.out.println("Here both propertis are matching each others");
				return true;
			}
			
			else
			{
				System.out.println("both properties are not matching");
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

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getChairmen() {
		return Chairmen;
	}

	public void setChairmen(String chairmen) {
		Chairmen = chairmen;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getFundsName() {
		return fundsName;
	}

	public void setFundsName(String fundsName) {
		this.fundsName = fundsName;
	}

	public String getTopperName() {
		return topperName;
	}

	public void setTopperName(String topperName) {
		this.topperName = topperName;
	}

	public String getpTTeacherName() {
		return doctorName;
	}

	public void setpTTeacherName(String pTTeacherName) {
		this.doctorName = pTTeacherName;
	}
	
	
	
	
	
}
