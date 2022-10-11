package com.Instantiation.boot.Runner;
import  com.Instantiation.boot.Collector;

public class CollectorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collector dis1= new Collector();
		System.out.println(dis1.name);
		System.out.println(dis1.age);
		System.out.println(dis1.district);
		System.out.println(dis1.batchNo);
		
		dis1.name="Laxmiakanth";
		dis1.age=40;
		dis1.district="Bagalkot";
		dis1.batchNo=34;
		
		System.out.println(dis1.name);
		System.out.println(dis1.age);
		System.out.println(dis1.district);
		System.out.println(dis1.batchNo);
		
	}

}
