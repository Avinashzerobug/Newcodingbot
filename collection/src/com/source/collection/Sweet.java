package com.source.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {

	
	public static void main(String[] args)
	{
		
		Collection<String> collection = new ArrayList();
		
		collection.add("Ladaki undi");
		collection.add("Rasmalayi");
		collection.add("Pakirappan peday");
		collection.add("RasGulla");
		collection.add("Barfi");
		collection.add("Jamun");
		collection.add("Besan");
		collection.add("Dil kush");
		collection.add("Kardant");
		collection.add("Kulfi");
		collection.add("Kheer");
		collection.add("Gajar ka Halwa");
		collection.add("Laddu");
		collection.add("Jalebi");
		collection.add("Mysore Pak");
		
		
		System.out.println(collection);
		
		System.out.println(System.lineSeparator());
		
		System.out.println(collection.size());
		
		System.out.println(System.lineSeparator());
		
		System.out.println("After clearing the data using the clear method");
		
		collection.clear();
		
		System.out.println(collection);
		
		
		
		
	}
}
