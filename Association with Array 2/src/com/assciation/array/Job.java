package com.assciation.array;

public class Job {
	
	public int salary;
	public String role;
	public boolean bond;
	public company company1 = new company();
	
	
	public void job(int salary, String role, boolean bond)
	{
	
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	
	public void letSee()
	{
		if(company1!=null)
		{
			company1.comp("Google","Sundar Pichai");
			company1.displaySee();
		}
		
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);

	
		
	}
	
	

	
}
