package com.source.repository;

import java.time.LocalDateTime;

import com.source.customexception.ArrayisfullnowDontAddMore;
import com.source.dto.WarDto;

public class WarRepositaryImpl implements WarRepositary {
	
	WarDto[] warDto = new WarDto[12];
	private int index = 0;
	
	

	@Override
	public boolean creating(WarDto waDto) {
		if(this.index>=warDto.length)
		{
			System.out.println("Exception Initialize");
			throw new ArrayisfullnowDontAddMore();
		}
		
		this.warDto[this.index]=waDto;
		System.out.println("Saved:"+waDto+"In index"+this.index);
		index++;
		
		return false;
	}

    @Override
	public WarDto findStartedBy(String tempWarName,int tempStartDate)
	{
    	for(WarDto warDto: warDto)
    	{
    		String tempName = warDto.getStartedBy();
    		int    start = warDto.getStartDate();
    		if(warDto!=null&& tempName.equals(tempWarName)&& start==tempStartDate)
    			
    		{
    			System.out.println(tempWarName);
    			System.out.println("The following the properties are match");
    			System.out.println(warDto);
    			return warDto;
    		}
    		
    	}
		return WarRepositary.super.findStartedBy(tempWarName, tempStartDate);
	}
		
		
	
	@Override
	public WarDto findByStartedAndStartedWith(String startedWith, String startedBy,LocalDateTime started,LocalDateTime ended) {
		for(WarDto warDto: warDto)
		{
			String tempStart = warDto.getStartedWith();
			String tempStart2 = warDto.getStartedBy();
			
			
			if(warDto!=null&& warDto.getStartedWith().equals(startedWith)&&warDto.getStartedBy().equals(startedBy)&&warDto.getStarted().equals(started)&&warDto.getEnded().equals(ended))
			{
				System.out.println(startedWith);
				System.out.println(startedBy);
				System.out.println(started);
				System.out.println(ended);
				System.out.println("the given output and initialized value both are matching");
				System.out.println(warDto);
				return warDto;
			}
		
		else
		{
		return WarRepositary.super.findByStartedAndStartedWith(startedWith, startedBy,started,ended);
		}
		}
		return WarRepositary.super.findByStartedAndStartedWith(startedWith, startedBy,started,ended);
	}
	
	


	@Override
	public int total()
	{
		return this.index;
		
	}
	
	
	
	
	
	
	
}
