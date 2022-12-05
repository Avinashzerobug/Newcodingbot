package com.source.abstraction.ruler;

import com.source.abstraction.Libraries;

public class Librarian {

	
	Libraries libraray;

	public Librarian() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Librarian(Libraries libraray) {
		super();
		this.libraray = libraray;
	}
	
	
	public void display()
	{
		if(libraray!=null)
		{
			String silence = this.libraray.keepSilence();
			String name = this.libraray.fillTheName();
			int bill = this.libraray.payTheBill();
			if(silence==null&&name==null&&bill==0)
			{
				System.out.println("all are following the rules");
			}
			else
			{
				System.out.println("some people are not following the rules");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
