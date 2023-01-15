package com.source.runner;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MobileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Realme", 10000);
		map.put("Redmi", 2000);
		map.put("Apple", 6520);
		map.put("Htc", 5400);
		map.put("Techno", 6500);
		map.put("Redmi", 8900);
		map.put("Samsung", 20120);
		map.put("Micromax", 3201);
		map.put("Lava", 50000);
		map.put("Oppo", 645200);
		map.put("Collpad", 58200);

		Set<Entry<String, Integer>> ref = map.entrySet();
		ref.forEach(e -> System.out.println(e.getKey().toUpperCase() + "   " + e.getValue()));
		System.out.println("======================================================");
		ref.stream().filter(e->e.getValue()>10000).forEach(e->System.out.println(e.getKey() +" "+e.getValue()));
		
		System.out.println("======================================================");

		ref.stream().filter(e->e.getKey().length()<5).forEach(e->System.out.println(e.getKey() + "  " + e.getValue()));
		System.out.println("======================================================");

		
		ref.stream().sorted((a,b)->b.getKey().compareTo(a.getKey())).forEach(e->System.out.println(e.getKey() + " " +  e.getValue()));
		
		
		
		
		
		
	}

}
