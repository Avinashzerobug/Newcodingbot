package com.association.boot;
import com.association.boot.associating.custom.Location;
import com.association.boot.associating.custom.Temple;
public class Mountain {

	public String name;
	public double  height;
    public Location locate = new Location();
    public Temple temp = new Temple();
	
	
	
	public Mountain()
	{
		super();		
	}
	
	public void mount(String name,double height)
	{
		this.name = name;
		this.height = height;
		
		if(locate!=null&&temp!=null)
		{
			
			locate.loc("Vidyagiri", "Bagalkot", "Karnataka", 587102, "INDIA");
			
			temp.namaste("Hallur Basavanna","Basavanna",546654,6456);
		}
		else
		{
			System.out.println("Welcome to the Null World");
			
		}
		
	}		
	public void wow()
	{
		System.out.println("Mountain name and Height");
        System.out.println(System.lineSeparator());
		System.out.println(this.name);
		System.out.println(this.height);
		System.out.println("************************************");
		System.out.println("Temples Details");
		 System.out.println(System.lineSeparator());
		temp.showoff();
		System.out.println("************************************");
		 System.out.println("Location Details and others");
		 System.out.println(System.lineSeparator());
		locate.show();
		
	}
		
		
		
	}
	
	

