package com.boot.types.Enum;

public enum Brands {

	BAGALKOT("BGK"),VIDYAGIRI("VID"),BADAMI("BAD"),NAVANAGAR("NAV");
	
	public String location;
	
	
	private Brands(String location)
	{
		this.location = location;
	}
	
	
}
