package com.boot.types.runner;

import com.boot.types.ShirtBrand;
import com.boot.types.Enum.Brands;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShirtBrand Fire = new ShirtBrand(Brands.VIDYAGIRI);
		Fire.noOfBrands = 500;
		Fire.setPrice(7000);
		Fire.show();
	}

}
