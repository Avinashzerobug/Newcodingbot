package com.boot.types.runner;

import com.boot.types.Lamp;
import com.boot.types.Enum.LampE;

public class LampRunner {

	public static void main(String[] args) {
		
		
		Lamp Fire = new Lamp(LampE.SANFRANCISCO);
		Fire.Diwali(5000);
		Fire.noOfLamp = 400000;
		Fire.show();
        

	}

}
