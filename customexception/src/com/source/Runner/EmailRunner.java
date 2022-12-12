package com.source.Runner;

import com.source.customexception.GmailExceptionInitialze;
import com.source.handling.EmailId;
import com.source.interfacing.GmailFace;

public class EmailRunner {

	public static void main(String[] args)throws GmailExceptionInitialze {
		// TODO Auto-generated method stub

		GmailFace email = new EmailId();
	 System.out.println(email.making("avinashmullur123@gmail.com"));   
	  System.out.println(email.making("edward@gmail.com"));
	  System.out.println(email.making("desmond@gmail.com"));
	  System.out.println(email.making("conner@gmail.com"));
	  System.out.println(email.making("RobertDowneyJr@gmail.com"));
	  System.out.println(email.making("Chrisevans@gmail.com"));
	  System.out.println(email.making("ChrisferNolan@gmail.com"));
	  System.out.println(email.making("Avatar@gmail.com"));
	  System.out.println(email.making("wowworld@gmail.com"));
	  System.out.println(email.making("Elonmusk@gmail.com"));
	  System.out.println(email.making("Elonmusk@gmail.com"));	 
		
	
	 System.out.println(email.totalGmails());	
		
		
		
		
		
	} 

}
