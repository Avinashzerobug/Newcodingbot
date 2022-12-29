package com.source.list;

import java.util.ArrayList;
import java.util.List;


public class IndexMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(200);
		list.add(300);
		list.add(350);
		list.add(250);
		
		list.add(1,400);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println(System.lineSeparator());
		
		list.set(3, 1000);
		list.remove(1);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println(System.lineSeparator());
				
		Integer ref=list.get(2);
		System.out.println("index value of 2:"+ref);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
