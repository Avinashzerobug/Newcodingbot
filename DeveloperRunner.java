package com.Instantiation.boot.Runner;
import com.Instantiation.boot.Developer;
public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Developer bot = new Developer();
		
		System.out.println(bot.name);
		System.out.println(bot.education);
		System.out.println(bot.experience);
		System.out.println(bot.salary);
		System.out.println(bot.company);
		
		bot.name="Avinash";
		bot.education="Engineering";
		bot.experience=0;
		bot.salary=0;
		bot.company="Unemployed";
		
		System.out.println(bot.name);
		System.out.println(bot.education);
		System.out.println(bot.experience);
		System.out.println(bot.salary);
		System.out.println(bot.company);
		
		
		
		
	}

}
