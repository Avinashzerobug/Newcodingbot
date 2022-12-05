package com.source.abstraction.ruler;

import com.source.abstraction.Passengers;

public class BMRCL {

	Passengers passengers;

	public BMRCL(Passengers passengers) {
		super();
		this.passengers = passengers;
	}

	public BMRCL() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void seeing()
	{
		if(passengers!=null)
		{
			String mask = this.passengers.dontCrossYellowLine();
			String line = this.passengers.dontCrossYellowLine();
			String allowed = this.passengers.waterBottleNotAllowed();
		    if(mask==null&&line==null&&allowed==null)
		    {
		    	System.out.println("they all are following the rules");
		    }
		    else
		    {
		    	System.out.println("some peoplea are not following the rules");
		    }
		}
		
		
		
		
	}
	
	
	
	
}
