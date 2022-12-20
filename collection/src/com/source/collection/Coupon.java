package com.source.collection;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection<String> collection = new LinkedHashSet();
		
		collection.add("Percent-off coupon");
		collection.add("Free Shipping coupon");
		collection.add("Free gift with coupon");
		collection.add("PromoCode coupon");
		collection.add("BOGO coupon");
		collection.add("Automatic coupon");
		collection.add("Gift-card coupon");
		collection.add("Buy one get one coupon");
		collection.add("Loyalty coupon");
		collection.add("Complementary serivce coupon");
		collection.add("Mystery deals coupon");
		collection.add("Mobile coupon");
		collection.add("Voucherss coupon");
		
		System.out.println(collection);
		
		System.out.println(System.lineSeparator());
		
		System.out.println(collection.size());
		
		System.out.println(System.lineSeparator());
		
		System.out.println("After clearing the data");
		
		collection.clear();
		
		System.out.println(collection);
		
		
	}

}
