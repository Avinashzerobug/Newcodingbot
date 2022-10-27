package com.association.boot.Runner;
import com.association.boot.Fuel;
import com.association.boot.Enum.FuelType;
public class FuelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fuel f = new Fuel();
		f.white(true,100,1.0,FuelType.BIODIESEL);
		
		f.show();
		
		
		
		
		
	}

}
