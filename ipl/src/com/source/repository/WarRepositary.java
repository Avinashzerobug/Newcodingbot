package com.source.repository;

import java.time.LocalDateTime;

import com.source.dto.WarDto;

public interface WarRepositary {

	
	boolean creating(WarDto waDto);
	
	default int total()
	{
		return 0;
		
	}
	
	
	default WarDto findStartedBy(String tempWarName,int tempStartDate)
	{
		return null;
		
	}
	
	
	default WarDto findByStartedAndStartedWith(String startedWith,String startedBy,LocalDateTime started,LocalDateTime ended)
	{
		return null;
		
	}


	
	
}
