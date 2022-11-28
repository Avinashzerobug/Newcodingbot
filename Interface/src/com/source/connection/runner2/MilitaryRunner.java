package com.source.connection.runner2;

import com.source.connection.Military;
import com.source.connection.runner.Army;

public class MilitaryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Military mili = new Army();
		Army army = new Army();
		
		
		mili.country();
		army.enemyCountry();
		mili.noOfWars();
		army.soldierName();
		mili.typesOfMilitary();
		
		
	}

}
