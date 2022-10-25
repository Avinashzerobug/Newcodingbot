package com.boot.types.runner;

import com.boot.types.Milk;
import com.boot.types.Enum.Cow;
public class MilkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Milk Fire = new Milk(Cow.VIDYAGIRI);
	    Fire.Diwali(70);
	    Fire.noOfMilks = 3000;
		Fire.show();
	}

}
