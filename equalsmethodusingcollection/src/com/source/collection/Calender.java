package com.source.collection;

import java.io.Serializable;

public class Calender implements Serializable {

	private String name;
	private int    noOfPages;
	private int yearOfCalender;
	
	public Calender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calender(String name, int noOfPages, int yearOfCalender) {
		super();
		this.name = name;
		this.noOfPages = noOfPages;
		this.yearOfCalender = yearOfCalender;
	}

	@Override
	public String toString() {
		return "Calender [name=" + name + ", noOfPages=" + noOfPages + ", yearOfCalender=" + yearOfCalender + "]";
	}

	
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof Calender)
			{
				Calender dto = (Calender)obj;
				if(dto.noOfPages==this.noOfPages)
				{
					System.out.println("Its having the same number of pages:"+this.noOfPages);
					return true;
				}
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

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getYearOfCalender() {
		return yearOfCalender;
	}

	public void setYearOfCalender(int yearOfCalender) {
		this.yearOfCalender = yearOfCalender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
