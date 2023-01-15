package com.source.runner;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CricketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String , Integer> map=new HashMap<String, Integer>();
		map.put("Dhoni", 10000);
		map.put("Sachin", 300000);
		map.put("Virat", 70000);
		map.put("Harsha", 5600);
		map.put("Mahadmad", 2003);
		Set<java.util.Map.Entry<String, Integer>> entries= map.entrySet();
		entries.stream().filter(e->e.getValue()<10000).forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));;
		
		
		
	}

}
