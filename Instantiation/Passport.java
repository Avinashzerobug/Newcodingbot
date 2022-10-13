package com.Instantiation.boot;

public class Passport {

	public int no;
	public String name;
	public int expiryDate;
	public String country;
	public String issueDate;
	
	public Passport(int no)
	{
		this.no = no;
		System.out.println("Passport no");
	}
	
	public Passport(String name)
	{
		this.name = name;
		System.out.println("Name of the Passport");
	}
	
	public Passport(String name,int no)
	{
		this.name = name;
		this.no = no;
		System.out.println("name of the Passport");
		System.out.println("Passport no");
	}
	
	public Passport(int no,String name)
	{
		this.no = no;
		this.name = name;
		System.out.println("Passport no");
		System.out.println("Name of the Passport");
	}
	
	public Passport(int expirydate,String country,String issuedate)
	{
		this.expiryDate = expiryDate;
		this.country = country;
		this.issueDate = issueDate;
		System.out.println("Passport expiry Date");
		System.out.println("Country name");
		System.out.println("issue date");
	}
	
	public Passport(String country,int no,int expiryDate)
	{
		this.country = country;
		this.no = no;
		this.expiryDate=expiryDate;
		System.out.println("name of the country");
		System.out.println("Passport no");
		System.out.println("expiry date");
	}
	
	public Passport(int no,int expiryDate)
	{
		this.no = no;
		this.expiryDate = expiryDate;
		System.out.println("Passport no");
		System.out.println("expiry Date");
	}
	
	public Passport(String country,String name) 
	{
		this.country = country;
		this.name = name;
		System.out.println("Country name");
		System.out.println("name of the Passport");
	}
	
	
}
