package com.source.inheritance.Runner;

import com.source.inheritance.Invitation;
import com.source.inheritance.Super.HouseWarmingInviation;

public class InvitationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Invitation invitation = new HouseWarmingInviation("Shri Nivas","HOME","White");
		HouseWarmingInviation house = (HouseWarmingInviation)invitation;
		house.letMeSee();
		
		
		
		
		
		
		
	}

}
