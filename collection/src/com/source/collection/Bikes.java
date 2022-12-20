package com.source.collection;

import java.util.Collection;
import java.util.HashSet;

public class Bikes {

	
	public static void main (String[]  hola)
	{
		
		Collection<String> collection = new HashSet();		
		
		
		collection.add("Discovery");
		collection.add("Duke");
		collection.add("Ns 200");
		collection.add("Aprilla");
		collection.add("Royal Enfield");
		collection.add("Thunder bird");
		collection.add("TVS jupitor");
		collection.add("Dominar");
		collection.add("Unicorn");
		collection.add("Pulsor");
		collection.add("Apache");
		collection.add("Kareezma R");
		collection.add("XL super");
		collection.add("RX 100");
		collection.add("DIO");
		collection.add("Shine");
		collection.add("BMW");
		collection.add("Hayabuza");
		collection.add("Kwaski");
		
		
		System.out.println(collection);
		
		System.out.println(System.lineSeparator());
		
		System.out.println(collection.size());
		
		System.out.println(System.lineSeparator());
		
		System.out.println("after the clear data");
		
		collection.clear();
		
		System.out.println(collection);
		
		
		
		
		
	}
}
