package com.Instantiation.boot.Runner;
import  com.Instantiation.boot.Chain;
public class ChainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chain lock = new Chain('R');
		System.out.println("Type:"+lock.type);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
		
		System.out.println(System.lineSeparator());
		lock = new Chain('T',700);
		System.out.println("Type:"+lock.type);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
		
		System.out.println(System.lineSeparator());
		lock = new Chain('S',500,10);
		System.out.println("Type:"+lock.type);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
		
		System.out.println(System.lineSeparator());
		lock = new Chain('X',1000,9,"Stainless Steel");
		System.out.println("Type:"+lock.type);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
		
		System.out.println(System.lineSeparator());
		lock = new Chain('X',1000,9,"Stainless Steel",true);
		System.out.println("Type:"+lock.type);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
		
		System.out.println(System.lineSeparator());
		lock = new Chain('X',1000,9,"Stainless Steel",true,"To move the cycle");
		System.out.println("Type:"+lock.type);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
		
		System.out.println(System.lineSeparator());
		lock = new Chain('X',1000,9,"Stainless Steel",true,"To move the cycle",false);
		System.out.println("Type:"+lock.type);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
		
		System.out.println(System.lineSeparator());
		lock = new Chain('X',1000,9,"Stainless Steel",true,"To move the cycle",false,3.5);
		System.out.println("Type:"+lock.type);
		System.out.println("weight:"+lock.weight);
		System.out.println("Price:"+lock.price);
		System.out.println("Length:"+lock.length);
		System.out.println("Material:"+lock.material);
		System.out.println("Weight:"+lock.weight);
		System.out.println("Stolen:"+lock.stolen);
		System.out.println("Used for:"+lock.usedFor);
		System.out.println("Fresh:"+lock.fresh);
	}
	}


