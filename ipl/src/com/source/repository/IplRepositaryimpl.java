package com.source.repository;

import com.source.customexception.ArraySizeIsFullCantAddMore;
import com.source.dto.IplDto;
import com.source.runner.IplRepositaryimplRunner;

public class IplRepositaryimpl implements IplRepositary {

	private IplDto[] iplDto = new IplDto[10];
	private int index = 0;
	
	
	@Override
	public boolean create(IplDto dto) throws ArraySizeIsFullCantAddMore {
		System.out.println("Running the  create IplDto"+ dto);
		if(this.index>=this.iplDto.length)
		{
			System.out.println("Running the Custom Exception");
			throw new ArraySizeIsFullCantAddMore();
		}
		
		this.iplDto[this.index]=dto;
		System.out.println("Saved:"+dto+"In index"+this.index);
		index++;
		
		// TODO Auto-generated method stub
		return true;
		
	}


	@Override
	public IplDto tempsetName(String tempName) {
		for(IplDto iplDto: iplDto) /*here "iplDto:" is index and iplDto is array size reference inbuilt java will 
			                       loop and increment it*/
		{
			String tempNames = iplDto.getCaptainName();
			if(iplDto!=null&&tempNames.equals(tempName))
			{
				System.out.println(tempName);
				System.out.println("Match thing is found");
				System.out.println(iplDto);
				
				return iplDto;
			}
		}
		
		
		
		return IplRepositary.super.tempsetName(tempName); /*at the time of compile time jvm will confuse weather call this (tempName)from class or interface
		                                                    using the Interface name(IplRepositary) it will call from interface method
		                                                    upside condition not true then its return this one */
	
	}

}
