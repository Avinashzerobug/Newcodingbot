package com.source.runner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryAndPresidentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> country = new HashMap<String,String>();
		country.put("India", "Droupati Murmu");
		country.put("USA", "Joe Biden");
		country.put("Russia", "Vladmir putin");
		country.put("Saudi Arabia", "Mohammad bin Salman");
		country.put("Iran", "Hassan");
		country.put("Indonesia", "Joko Widodo");
		country.put("Pakistan", "Arif Alvi");
		country.put("Turkey", "Recep Tayyip Erdogon");
		country.put("Afghanistan", "Mohammad Hassan Akhund");
		country.put("Yemen", "Mansur Hadi");
		country.put("Thailand", "Maha Vajiralongkorn");
		country.put("Poland", "Morawiecki");
		country.put("Russia", "Mishustin");
		country.put("Singapore", "Loong");
		country.put("Sri Lanka", "Gunawardena");
		country.put("Swaziland", "Dlamini");
		country.put("Thailand", "Chan-o-cha");
		country.put("Uganda", "Nabbanja");
		country.put("United Kingdom", "Sunak");
		country.put("Ukraine", "Shmyhal");
		country.put("Turkey", "Yaldiram");
		country.put("United Arab Emirates", "Mohammed");

		country.keySet().stream().sorted((a1, a2) -> a1.compareTo(a2)).forEach((e) -> System.out.println(e));

		country.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

		List<String> valu = country.values().stream().collect(Collectors.toList());
		valu.stream().filter(e -> e.length() >= 10).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("------------------------------------------------");
		for (String string : valu) {
			if (string.length() > 10) {
				string.replaceAll("/s", "update");
			}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
	}

	}
