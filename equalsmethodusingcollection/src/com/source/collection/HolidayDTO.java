package com.source.collection;

import java.io.Serializable;

public class HolidayDTO implements Serializable{

	private String reason;
    private int   noOfHolidays;
    private boolean sickHoliday;
    
	public HolidayDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HolidayDTO(String reason, int noOfHolidays, boolean sickHoliday) {
		super();
		this.reason = reason;
		this.noOfHolidays = noOfHolidays;
		this.sickHoliday = sickHoliday;
	}

	@Override
	public String toString() {
		return "HolidayDTO [reason=" + reason + ", noOfHolidays=" + noOfHolidays + ", sickHoliday=" + sickHoliday + "]";
	}

	
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof HolidayDTO)
			{
				HolidayDTO dto = (HolidayDTO)obj;
				if(dto.reason.equals(this.reason))
				{
					System.out.println("its a having the same reasons for holidays:"+this.reason);
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getNoOfHolidays() {
		return noOfHolidays;
	}

	public void setNoOfHolidays(int noOfHolidays) {
		this.noOfHolidays = noOfHolidays;
	}

	public boolean isSickHoliday() {
		return sickHoliday;
	}

	public void setSickHoliday(boolean sickHoliday) {
		this.sickHoliday = sickHoliday;
	}
	
}
