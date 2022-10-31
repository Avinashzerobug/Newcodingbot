package com.assciation.array;

public class Email {
	
	public long id;
	public int password;
	public long mobileNo;
	public company company2 = new company();
	
	
	public void  email(long id, int password, long mobileNo) 
	{
	
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	
	
	public void letMeSee()
	{
		if(company2!=null)
		{
			company2.comp("Microsoft","Bill Gates");
			company2.displaySee();
		}
		else
		{
			System.out.println("Welcome to the Null world");
		}
		
		System.out.println("ID number,password and Mobile No");
		System.out.println("********************************");
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		System.out.println(System.lineSeparator());
		
	}
	
	
	
	
	
	
	

}
