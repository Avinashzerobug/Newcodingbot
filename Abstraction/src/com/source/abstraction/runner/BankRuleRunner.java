package com.source.abstraction.runner;

import com.source.abstraction.BankRules;
import com.source.abstraction.overriding.Bank;
import com.source.abstraction.ruler.RBI;

public class BankRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankRules rule = new Bank();
		
		RBI rbi = new RBI(rule);
		
		rbi.see();
		
		
		
	}

}
