package com.source.abstraction.ruler;


import com.source.abstraction.Patient;

public class HospitalManagement {

	
	Patient patience;

	public HospitalManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HospitalManagement(Patient patience) {
		super();
		this.patience = patience;
	}
	
	
	public void visiting()
	{
		if(patience!=null)
		{
			boolean smoke = this.patience.smoking();
			int     visitors = this.patience.noOfVisitorsAllow();
			String  silence = this.patience.keepSilence();
			
			if(smoke==true&&visitors==0&&silence==null)
			{
				System.out.println("all the visitors are following the rules");
			}
			else
			{
				System.out.println("visitors are not following the rules");
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
