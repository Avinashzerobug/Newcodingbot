package com.assciation.array;

public class Person {

	
	public String name;
	public Email[] email;
	public Job     job = new Job();
	
	
	
	public void person(String name, Email[] email) 
	{
		
		this.name = name;
		this.email = email;
	
	}
	
	
	public void watch()
	{
		if(email!=null)
		{
			
			for(int i=0;i<email.length;i++)
			{
				Email mail = email[i];
			
			
			if(mail!=null)
			
				mail.letMeSee();		
			}
			
		if(job!=null)
		{
			job.job(1000000,"Developer",true);
			job.letSee();
		}
		else 
		{
			System.out.println("welome to the Null world");
		}
		}
		
		System.out.println(this.name);
		
	}
	
	
	
	
}
