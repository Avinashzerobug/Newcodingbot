package com.method.boot.Runner;

import com.method.boot.History;

public class HistoryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items1 = {"Aegon","Veserys","Jhonson","Rhanerya"};
		String[] items2 = {"Danerys","Rhanerys","Alicent"};
		String[] items3 = {"Kings Landing","Old town","White Harbor","Gull Town"};
		double[] items4 = {340455.0,150463565.0,200034635.0};
		long[]   items5 = {13458345,79454345,14553545};
		String[] items6 = {"Knight King","White Harbor","Danerys Targeryn"};
		
		History pass = new History("Aegonr","ALicent","Mario Puzo",1,true,items1,items2,items3,items4,items5,items6);
		
		pass.display();

	}

}
