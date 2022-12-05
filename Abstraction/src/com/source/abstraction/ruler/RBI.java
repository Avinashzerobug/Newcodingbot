package com.source.abstraction.ruler;

import com.source.abstraction.BankRules;

public class RBI {

	
	BankRules rules;

	public RBI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RBI(BankRules rules) {
		super();
		this.rules = rules;
	}
	
	
	public void see()
	{
		if(rules!=null)
		{
			String mask = this.rules.wearmask();
			int    money = this.rules.collectTheMoney();
			String smoke= this.rules.dontSmoke();
		   if(mask==null&&money==0&&smoke==null)
		   {
			   System.out.println("they all are following the rules");
		   }
		   else
		   {
			   System.out.println("they are not following the rules");
		   }
		}
	}
	
}
