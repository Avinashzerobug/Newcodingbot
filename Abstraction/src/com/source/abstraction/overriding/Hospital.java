package com.source.abstraction.overriding;

import com.source.abstraction.Patient;

public class Hospital implements Patient {

	@Override
	public boolean smoking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String keepSilence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int noOfVisitorsAllow() {
		// TODO Auto-generated method stub
		return 0;
	}

}
