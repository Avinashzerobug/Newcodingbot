package com.source.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Currencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	   Collection<String> collection = new TreeSet();
		
	   collection.add("Dollar");
	   collection.add("Euro");
	   collection.add("GBP");
	   collection.add("Swiss Franc");
	   collection.add("Canadian Dollar");
	   collection.add("Australian Dollar");
	   collection.add("Danish Krone");
	   collection.add("Japanese Yen");
	   collection.add("Czech Koruna");
	   collection.add("Brazilian Real");
	   collection.add("Bulgarian Lev");
	   collection.add("Indian Rupee");
	   collection.add("Bahraini Dinar");
	   collection.add("New Zealand Dollar");
	   collection.add("Hong kong Dollar");
	   collection.add("Russian Ruble");
	   collection.add("Jordian Dinar");
	   collection.add("Egyptian Pound");
	   collection.add("Kuwaiti Dinar");
	   collection.add("Barbadian Dollar");
	   collection.add("Brunei Dollar");
	   collection.add("Indonesian Rupiah");
	   collection.add("South Korean won");
	   collection.add("Singapore Dollar");
	   collection.add("Boliviano");
	   collection.add("Rand");
	   collection.add("Peso");
	   
	   System.out.println(collection);
	  
	   System.out.println(System.lineSeparator());
	   
	   System.out.println(collection.size());
	   
	   System.out.println(System.lineSeparator());
	   
	   System.out.println("After removing the data");
	   
	   collection.clear();
	   
	   System.out.println(collection);
		
	}

}
