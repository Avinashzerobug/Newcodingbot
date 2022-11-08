package com.source.inheritance.Runner;

import com.source.inheritance.Marriage;
import com.source.inheritance.Super.LoveMarriage;

public class MarriageRunner {

	public static void main(String[] args) {

		
		
		Marriage mar = new LoveMarriage("love marriage", "Bangalore", 5636767);
		LoveMarriage love = (LoveMarriage)mar;
        love.love();
		
		
		
		
		
	

	}

}
