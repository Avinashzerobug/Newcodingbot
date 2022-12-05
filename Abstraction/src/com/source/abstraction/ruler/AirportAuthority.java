package com.source.abstraction.ruler;

import com.source.abstraction.Passenger;

public class AirportAuthority {

	Passenger pass;

	public AirportAuthority(Passenger pass) {
		super();
		this.pass = pass;
	}

	public AirportAuthority() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   public void show()
   {
	   if(pass!=null)
	   {
		   String spit = this.pass.dontSpit();
		   String allowed = this.pass.weaponsAreNotAllowed();
		   int   money = this.pass.collectTheMoney();
		   if(spit==null&&allowed==null&&money==0)
		   {
			   System.out.println("People are following the rules");
		   }
		   else
		   {
			   System.out.println("people are following the rules");
		   }
	   }
   }
	
	
	
}
