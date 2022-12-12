package com.source.handling;

import com.source.customexception.GmailExceptionInitialze;
import com.source.interfacing.GmailFace;

public class EmailId implements GmailFace {

	
	private String[] mailId= new String[10];
	private int gmailIndex = 0;

	@Override
	public boolean making(String gmail) throws GmailExceptionInitialze 
	{                            
		if(this.gmailIndex>=this.mailId.length)
		{
	       throw new GmailExceptionInitialze(); 
		}
	    this.mailId[gmailIndex]=gmail;
	    this.gmailIndex++;
				
		return false;
	}

   	@Override
   	public int totalGmails()
   	{
   		System.out.println("running totalGmails");
   		return GmailFace.super.totalGmails();
   	}
   	


	
}
