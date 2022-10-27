package com.association.boot;
import com.association.boot.Enum.Shape;
import com.association.boot.associating.Company;

public class Piller {

	
	public long id;
	public String place;
	public double height;
	public String supporting;
	public Shape  shape;
	public Company comp = new Company("Google",'G');
	
	
	public Piller()
	{
		
	}
	
	public void pilly(long id,String place,double height,String supporting,Shape shape)
	{
		this.id = id;
		this.place = place;
		this.height = height;
		this.supporting = supporting;
		this.shape = shape;
	
		
		if(comp!=null)
		{
	         this.comp.pill();
	        
			
		}
		else
		{
			System.out.println("Welcome to the Null World");
		}
	}
	public void show()
	{
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.height);
		System.out.println(this.supporting);
		System.out.println(this.shape);
      	comp.showOff();
	}	
		
		
		
		
		
	
	
	}
	
	
	

